package ru.mirea.lab2.subtask4;

import java.util.Arrays;

public class Shop implements ShopInterFace {
    private Computer[] computers;
    public void add(String computer){
        Computer[] computersTemp;
        if(computers == null) computersTemp = new Computer[]{new Computer(computer)};
        else
        {computersTemp = new Computer[computers.length + 1];
            System.arraycopy(computers, 0, computersTemp, 0, computers.length);
        computersTemp[computers.length] = new Computer(computer);}
        computers = computersTemp;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computers=" + Arrays.toString(computers) +
                '}';
    }

    public void delete(String computer){
        int flag = -1;
        for (int i = 0; i < computers.length; i++) {
            if(computers[i].getName().equals(computer)){
                flag = i;
                computers[i] = null;
            }
        }
        if (flag != - 1){
            Computer[] computersTemp = new Computer[computers.length -1];
            System.arraycopy(computers, 0, computersTemp, 0, flag);
            for (int i = flag; i < computersTemp.length; i++) {
                computersTemp[i]=computers[i+1];
            }
            computers = computersTemp;
        }


    }

    @Override
    public String search(String computer) {
        for (int i = 0; i < this.getComputers().length; i++) {
            if(this.getComputers()[i].getName().equals(computer)) return "Yes";
        }
        return "No";
    }

    public Computer[] getComputers() {
        return computers;
    }
}
