//section10-conditional
public class NameOfDay{
        public static void main(String[] args){
            System.out.println(determineNameOfDay(2));
        }
        public static String determineNameOfDay(int dayNumber){
            switch(dayNumber){
                case 0:return "sunday";
                case 1:return "monday";
                case 2:return "tuesday";
                case 3:return "wednesday";
                case 4:return "thursday";
                case 5:return "friday";
                case 6:return "saturday";
                default:return "Invalid Day";
            }
        }
    }

