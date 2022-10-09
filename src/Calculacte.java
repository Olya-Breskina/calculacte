
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Calculacte {
    public static void main(String[] args) throws ParseException, IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Средняя зарплата за 12 месяцев: ");
        double sredZP= Double.parseDouble(reader.readLine());

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        System.out.println("Дата начало отпуска  в формате dd.MM.yyyy: ");
        Date date1 = dateFormat.parse(reader.readLine());

        System.out.println("Дата окончания отпуска  в формате dd.MM.yyyy: ");
        Date date2 = dateFormat.parse(reader.readLine());

        long milliseconds = date2.getTime() - date1.getTime();

        // 24 часа = 1 440 минут = 1 день
        int days = (int) (milliseconds / (24 * 60 * 60 * 1000))+1;
        System.out.println("Отпуск составил: " + days);

        double holidaypay=sredZP*days;
        System.out.println("Отпускные составляют: " + holidaypay);

      }
}


