import java.text.SimpleDateFormat;
import java.util.Date;

public class Detail {
    //  назва, торгова марка, країна
    //виробник, дата виробництва, час безвідмовної роботи,
    //багаторядкова примітка (в дано

    private String title;
    private String tradeMark;
    private String country;
    private Date production;
    private int workTime;
    private String info;

    public Detail() {
        this.title = "none";
        this.tradeMark = "none";
        this.country = "none";
        this.production = null;
        this.workTime = 0;
        this.info = "none";
    }

    public Detail(String title, String tradeMark, String country, Date production, int workTime, String info) {
        this.title = title;
        this.tradeMark = tradeMark;
        this.country = country;
        this.production = production;
        this.workTime = workTime;
        this.info = info;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTradeMark() {
        return tradeMark;
    }

    public void setTradeMark(String tradeMark) {
        this.tradeMark = tradeMark;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Date getProduction() {
        return production;
    }

    public void setProduction(Date production) {
        this.production = production;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public void show() {
        System.out.println(
                "Model: " + this.title + "\n" + "Trademark: " + this.tradeMark + "\n" + "Country: " + this.country + "\n" + "Production: " + this.production + "\n" + "Worktime: " + this.workTime + "\n" + "Info: " + this.info + "\n"
        );
    }

    public void main(String[] args) {

        String dateStart = "03/02/2011 16:46:28";
        String dateStop = "01/15/2012 10:31:48";

        SimpleDateFormat format = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

        Date d1 = null;
        Date d2 = null;

        try {
            d1 = format.parse(dateStart);
            d2 = format.parse(dateStop);

            long diff = d2.getTime() - d1.getTime();

            long diffSeconds = diff/1000 % 60;
            long diffMinutes = diff/(60 *  1000) % 60;
            long diffHours = diff/(60 *  60 *  1000) % 24;
            long diffDays = diff/(24 *  60 *  60 *  1000);

            System.out.print(diffDays + " days, ");
            System.out.print(diffHours + " hours, ");
            System.out.print(diffMinutes + " minutes, ");
            System.out.print(diffSeconds + " seconds.");

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
