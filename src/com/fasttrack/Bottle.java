package com.fasttrack;

public class Bottle {
    private int totalCapacity = 0;
    private int availableLiquid = 0;
    private boolean isOpen;

    public Bottle(int totalCapacity) {
        this.totalCapacity = totalCapacity;
    }

    public void openBottle() {
        if (this.isOpen) {
            System.out.println("Bottle is already open");
        } else {
            this.isOpen = true;
            System.out.println("Bottle is now open");
        }
    }

    public void closeBottle() {
        if (!this.isOpen) {
            System.out.println("Bottle is already closed");
        } else {
            this.isOpen = false;
            System.out.println("Bottle is now closed");
        }
    }

    private boolean isOpen() {
        return this.isOpen;
    }

    private boolean hasLiquid() {
        return this.availableLiquid > 0;
    }

    public void drink(int quantity) {
        if (!this.isOpen()) {
            System.out.println("Bottle is closed");
            return;
        }

        if (!this.hasLiquid()) {
            System.out.println("Bottle is empty");
            return;
        }

        if (this.availableLiquid >= quantity) {
            this.availableLiquid = this.availableLiquid - quantity;
            System.out.println("You have " + this.availableLiquid + " left in the bottle after drinking");
        } else {
            System.out.println("Not enough liquid");
        }
    }

    public void fillBottle(int fillLiquid) {
        if (fillLiquid > this.totalCapacity) {
            this.availableLiquid = this.totalCapacity;
            System.out.println("Bottle is full and you don't have space for another " + (fillLiquid - this.totalCapacity) + " ml");


        } else if (this.availableLiquid < this.totalCapacity) {
            this.availableLiquid = this.availableLiquid + fillLiquid;
            System.out.println("Available quantity is: " + fillLiquid);

        } else if (this.totalCapacity == fillLiquid) {
            ;
            System.out.println("Bottle is full");
        }
    }
}
