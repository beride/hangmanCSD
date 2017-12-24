

public class ShowTennisGame {
    public static String showResult(int playerA,int playerB){
        String wordList[] = {"Love", "Fifteen", "Thirty", "Forty", "All", "Deuce"};

        String result = "";
//        if (playA == 0 && playB == 0){
//            result = "Love All";
//        }else if (playA == 1 && playB == 1){
//            result = "Fifteen All";
//        }else if (playA == 2 && playB == 2){
//            result = "Thirty All";
//        }else if (playA == 3 && playB == 3){
//            result = "Deuce";
//        }

//        if (playA - playB == 0) {
//            switch (playA) {
//                case 0:
//                    result = view[playA] + " " + view[3];
//                    break;
//                case 1:
//                    result = view[playA] + " " + view[3];
//                    break;
//                case 2:
//                    result = view[playA] + " " + view[3];
//                    break;
//                default:
//                    result = view[4];
//                    break;
//            }
//        }

        int temp = playerA - playerB;
        if (temp == 0){
            if (playerA < 3){
                result = wordList[playerA] + " " + wordList[4];
            }else {
                result = wordList[5];
            }
        }

        if (temp > 0 && playerA < 4 && playerB == 0) {
//            if (temp == 1) {
//                result = "Fifteen Love";
//            } else if (temp == 2) {
//                result = "Thirty Love";
//            } else if (temp == 3) {
//                result = "Forty Love";
//            }
            result = wordList[temp] + " " + wordList[0];
        } else if (playerA >= 4 && temp >= 2) {
            return "A Win";
        } else if (playerA >= 4 && temp == 1) {
            return "A Advance";
        }else if(playerA < 4 && playerB < 4 && temp > 0){
            result = wordList[playerA] + " " + wordList[playerB];
        }

        return result;
    }
}
