package data;

import data.exposition.*;

import java.util.Arrays;

public class Environment {

    Carbo carbo = Carbo.NO_CARBO;
    Chemical chemical = Chemical.NO_CHEMICAL;
    Chlorine chlorine = Chlorine.NO_CHLOR;
    Freezing freezing = Freezing.NO_FREEZING;
    Sea sea = Sea.NO_SEA;

    int [] evironmentMatrix={0,0,0,0,0};
    int [] evironmentMatrixForClass={0,0,0,0,0};
    int environmentClass=0;
    int environmentClassForClass=0;


    public Carbo getCarbo() {
        return carbo;
    }

    public void setCarbo(Carbo carbo) {
        int index=0;
        this.carbo = carbo;
        switch (carbo){
            case NO_CARBO:
                index=0;
            case XC_1:
                index=1;
            case XC_2:
                index=2;
            case XC_3:
                index=2;
            case XC_4:
                index=3;
        }

        evironmentMatrix[0]=index;
        evironmentMatrixForClass[0]=index;
    }

    public Chemical getChemical() {
        return chemical;
    }

    public void setChemical(Chemical chemical) {
        this.chemical = chemical;
    }

    public Chlorine getChlorine() {
        return chlorine;
    }

    public void setChlorine(Chlorine chlorine) {
        int index=0;
        this.chlorine = chlorine;
        switch (chlorine){
            case NO_CHLOR:
                index=0;
            case XD_1:
                index=4;
            case XD_2:
                index=5;
            case XD_3:
                index=6;
        }

        evironmentMatrix[2]=index;
        evironmentMatrixForClass[2]=index;

    }

    public Freezing getFreezing() {
        return freezing;
    }

    public void setFreezing(Freezing freezing) {
        this.freezing = freezing;
        }

    public Sea getSea() {
        return sea;
    }

    public void setSea(Sea sea) {
        int index=0;
        int indexForClass=0;
        this.sea = sea;
        switch (sea) {
            case NO_SEA:
                index = 0;
            case XS_1:
                index = 4;
                indexForClass=5;
            case XS_2:
                index = 5;
                indexForClass=5;
            case XS_3:
                index = 6;
                indexForClass=6;
        }

        evironmentMatrix[4] = index;
        evironmentMatrixForClass[4]=indexForClass;
    }

    public void setEnvironmentClass() {
        this.environmentClass = Arrays.stream(evironmentMatrix).max().getAsInt();
    }

    public void setEnvironmentClassForClass() {
        this.environmentClassForClass= Arrays.stream(evironmentMatrixForClass).max().getAsInt();
    }
}
