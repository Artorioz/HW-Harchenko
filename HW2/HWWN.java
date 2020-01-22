package HW2;

class WorkWithNumbers {
    private boolean numberOne, numberTwo, numberThree, numberFour, numberFive, numberSix;
    private int quantityOccurrencesFragment = 0;

    void findQuantityOccurrencesFragment(int number) {
        if (number == 1) {
            numberOne = true;
        } else if (number == 2) {
            numberTwo = true;
        } else if (number == 3) {
            numberThree = true;
        } else if (number == 4) {
            numberFour = true;
        } else if (number == 5) {
            numberFive = true;
        } else if (number == 6) {
            numberSix = true;
        } else {
            numberOne = false;
            numberTwo = false;
            numberThree = false;
            numberFour = false;
            numberFive = false;
            numberSix = false;
        }

        if(numberOne && numberTwo && numberThree && numberFour && numberFive && numberSix) {
            quantityOccurrencesFragment++;
            numberOne = false;
            numberTwo = false;
            numberThree = false;
            numberFour = false;
            numberFive = false;
            numberSix = false;
        }

    }

    int getQuantityOccurrencesFragment() {
        return quantityOccurrencesFragment;
    }
}