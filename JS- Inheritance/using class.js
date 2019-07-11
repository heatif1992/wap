"use strict";
let classMethode = (function() {
    class Bicycle {
        constructor() {
            this.speed = 0;
        }
        applyBrake(value) {
            this.speed -= parseInt(value);
        }
        speedup(value) {
            this.speed += parseInt(value);
        }
    }

    class MountainBike extends Bicycle {
        constructor() {
            super();
            this.gear = 1;
        }
        setGear(value) {
            this.gear = parseInt(value);
        }
    }

    let start = function() {
        let newB = new Bicycle();
        console.log("test new bike");
        newB.speedup(5);
        console.log(newBike);
        newB.applyBrake(4);
        console.log(newBike);

        let newMB = new MountainBike();
        console.log("test new MountainBike");
        newMB.speedup(17);
        console.log(newMntBike);
        newMB.applyBrake(6);
        console.log(newMntBike);
        newMB.setGear(4);
        console.log(newMntBike);
    }

    return start;
})();