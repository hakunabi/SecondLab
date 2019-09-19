public class Lab2 {
    public static void main(String[] args) {


        // challenge # 1
//        double thisYear = 1604;
//        boolean isPossibleLeapYear;
//        if (thisYear >= 9999 && thisYear <= 1) {
//            isPossibleLeapYear = false;
//        } else if (thisYear >= 1 && thisYear <= 9999) {
//            isPossibleLeapYear = true;
//            if (thisYear % 4 == 0) {
//                System.out.println("This is a Leap year!");
//            } else if (thisYear % 4 == 0 && thisYear % 100 == 0) {
//                System.out.println("This is  a Leap year!");
//            } else if (thisYear % 400 == 0 && thisYear % 4 == 0 && thisYear % 100 == 0) {
//                System.out.println("This is a Leap year!");
//            } else {
//                System.out.println("it is not a leap year!");
//            }
//        }
//    }


// Challenge # 2
//        float speedMile = 2.828f;
//        float speedKilometer = (float) (speedMile / 1.609);
//
//        if (speedMile <= 0){
//            System.out.println("Please input a positive number!");
//        }
//        else if (speedMile >= 0){
//            speedKilometer = speedMile /1.609f;
//            System.out.println("It's " + speedKilometer + "kilometers per hour!");
//        }


// Challenge # 3
//        double Minutes = -1;
//
//        if (Minutes > 0) {
//            System.out.println("There are " + Minutes / 60 + " hours within " + Minutes + " minutes.");
//            System.out.println("There are " + Minutes / 1440 + " days within " + Minutes + " minutes.");
//            System.out.println("There are " + Minutes / 525600 + " years within " + Minutes + " minutes.");
//        }
//        else {System.out.println("There are no hours, days, or years within " + Minutes + " minutes.");
//
//        }


// challenge # 4
        int firstNumber = 3;
        int secondNumber = 3;
        int thirdNumber = 3;

        if (firstNumber == secondNumber && firstNumber == thirdNumber) {
            System.out.println("All 3 numbers are the same!");
        } else if (firstNumber == secondNumber || firstNumber == thirdNumber || secondNumber == thirdNumber) {
            System.out.println(" All 3 numbers are not ALL the same or ALL different!");
        } else {
            System.out.println("All 3 numbers are different!");
        }

    }

}
