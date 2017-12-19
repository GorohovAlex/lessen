package pkg20171212_lessen;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author _smil
 */
public class AList implements iList {

    private int[] x = new int[0];

    @Override
    public void add(int aValue) {
        int[] newArray = new int[this.x.length + 1];

        for (int i = 0; i < this.x.length; i++) {
            newArray[i] = this.x[i];
        }

        newArray[this.x.length] = aValue;

        this.x = newArray;
    }

    @Override
    public int size() {
        return x.length;
    }

    @Override
    public void delete(int index) {
        
        int len = (this.x.length==0)?0:this.x.length - 1;  
        
        int[] newArray = new int[len];

        if (index < this.x.length && index > 0) {
            for (int i = 0, j = 0; i < this.x.length; i++, j++) {
                if (i == index) {
                    j--;
                } else {
                    newArray[j] = this.x[i];
                }
            }
        }
        this.x = newArray;
    }

    public String toString() {
        String str = "";

        for (int i = 0; i < this.x.length; i++) {
            str += this.x[i] + " ";

        }
        return str;
    }

    @Override
    public void sort() {
        for (int i = 0; i < this.x.length - 1; i++) {

            for (int j = i; j < this.x.length - 1 - i; j++) {
                if (this.x[j] > this.x[j + 1]) {
                    int buff = this.x[j];
                    this.x[j] = this.x[j + 1];
                    this.x[j + 1] = buff;
                }
            }
        }
    }

    @Override
    public int get(int aIndex) {
        int get = -1;

        if (aIndex >= 0 && aIndex < this.x.length) {
            get = this.x[aIndex];
        }

        return get;
    }

}
