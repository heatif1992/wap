"use strict";
let runModule3 = (function() {
    function Bicycle() {
        this.speed = 0;
        this.speedup = function(value) {
            this.speed += parseInt(value);
        }
        this.applyBrake = function(value) {
            this.speed -= parseInt(value);
        }
    }

    function MountainBike() {
        Bicycle.call(this);
        this.gear = 1;
    }

    MountainBike.prototype = Object.create(Bicycle.prototype);
    MountainBike.prototype.constructor = MountainBike;

    MountainBike.prototype.setGear = function(value) {
        this.gear = parseInt(value);
    }

    let start = function() {
        let newBike = new Bicycle();
        console.log("PLAYING WITH NEW BIKE");
        newBike.speedup(9);
        console.log(newBike);
        newBike.applyBrake(4);
        console.log(newBike);

        let newMntBike = new MountainBike();
        console.log("PLAYING WITH NEW MOUNTAIN BIKE");
        newMntBike.speedup(5);
        console.log(newMntBike);
        newMntBike.applyBrake(3);
        console.log(newMntBike);
        newMntBike.setGear(2);
        console.log(newMntBike);
    }

    return start;
})();