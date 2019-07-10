"use strict";

window.onload = function() {
    let accountInfoList = [];

    const AccountModule = (function() {
        const createAccount = function(account_name, deposit) {
            return {
                "Account Name": account_name,
                "Balance": deposit * 1
            };
        };
        return {
            createAccount: function(accname, deposit) { return createAccount(accname, deposit); }
        };
    })();

    document.getElementById("Submit").onclick = function() {
        var accname = document.getElementById("name").value.trim(); 
        var deposit = document.getElementById("deposit").value.trim(); 

        if (accname && deposit) {
            var account = AccountModule.createAccount(accname, deposit); 

            let flag = false;
            for (const savedAccount of accountInfoList) {
                if (savedAccount["Account Name"] === account["Account Name"]) {
                    var currIndex = accountInfoList.indexOf(savedAccount);

                    savedAccount.Balance += account.Balance;
                    accountInfoList[currIndex] = savedAccount; 
                    flag = true;
                }
            }

            if (!flag) {
                accountInfoList.push(account); 
            }

            populateTextArea(); 
        } else {
            alert("enter the account name and deposit");
        }
    };

    function populateTextArea() {
        var textArea = document.getElementById("created_account");

        textArea.value = "";
        for (const account of accountInfoList) {
            for (const key in account) {
                textArea.value += `${key}: ${account[key]}; `;
            }
            textArea.value += "\n";
        }
    }
};