public class TimeConverter {
    public static int convertHoursToMinutes(int hours) {
        // Your task: complete this method
        if(hours < 0){
            return -1;
        }
        int mins = hours*60;
        return mins;
    }
    
    public static int convertDaysToMinutes(int days) {
        // Your task: complete this method
        if(days < 0){
            return -1;
        }
        int mins1 = days*24*60;
        return mins1;
    }

    public static void main(String[] args){
        int hrToMin = TimeConverter.convertHoursToMinutes(24);
        int dayToMin = TimeConverter.convertDaysToMinutes(24);
        System.out.println("24 hrs into min is equals to "+hrToMin+" mins");
        System.out.println("24 days into min is equal to "+dayToMin+" mins");
    }
}