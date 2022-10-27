package com.javapractice.designTypes.proxy06;

class ConsolePrinter implements Printer {
    private String fileName;

    public ConsolePrinter(String fileName){
        this.fileName = fileName;
    }
    @Override
    public void print() {
        System.out.println("Displaying " + fileName);
    }
}
