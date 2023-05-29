
import java.util.ArrayList;
import java.util.Scanner;




public class App {
    
    private static ArrayList<pets> arrayOfpPets = new ArrayList<>();
    

    public static void main(String[] args) throws Exception {
        
        

        pets dog = new pets(0, "СОБАКА", "01.01.2022", "Лежать, Стоять");
        pets cat = new pets(1, "КОШКА", "01.02.2021", "Кушать, Спать");
        pets hamster = new pets(2, "ХОМЯК", "01.01.2002", "Беги, Грызи");

        arrayOfpPets.add(dog);
        arrayOfpPets.add(cat);
        arrayOfpPets.add(hamster);
        
        Navi();

    }
    

    public static void prinlist() {
        for (pets pets : arrayOfpPets) {
            System.out.println(pets._name + "," + pets._birthday);
        }
    }


    public static void Navi(){
        Scanner choise = new Scanner(System.in);
        System.out.println("\n" + "Выберите нужный пунк:");
        String ln1 = "1. Добавить новое животное";
        String ln2 = "2. Список команд, которое выполняет животное";
        String ln3 = "3. Обучить новым командам";
        String ln4 = "4. Завершить работу";
        System.out.println(ln1 + "\n" + ln2 + "\n" + ln3 + "\n" + ln4);
        int intchoise = choise.nextInt();
        
        if (intchoise == 1){
            addPets();
            Navi();
        }
        if (intchoise == 2){
            getCommands();
            Navi();
        }
        if (intchoise == 3){
            setCommands();
            Navi();
        }
        if (intchoise == 4){
            System.out.println("Работа программы завершена");
        }
    }


    public static void addPets(){
        Scanner inname = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String nname = inname.nextLine().toUpperCase();

        Scanner inq = new Scanner(System.in);
        System.out.print("Введите дату рождения: ");
        String qq = inq.nextLine();

        Scanner inW = new Scanner(System.in);
        System.out.print("Введите команды, которая умеет выполнять: ");
        String ww = inW.nextLine();

        pets newpPets = new pets(maxid(), nname, qq, ww);
        System.out.println("Животное успешно добавлено!" + "\n" );
        arrayOfpPets.add(newpPets);
    }


    private String name;
    private String birthday;
    private String commands;
    




    public static void setCommands(){
        Scanner inname = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String nname = inname.nextLine().toUpperCase();
        boolean indicator1 = false;
        for (pets pets : arrayOfpPets) {
            if (pets._name.equals(nname)) {
                Scanner incommand = new Scanner(System.in);
                System.out.print("Введите новые команды: ");
                String nncommand = incommand.nextLine();
                pets._commands = pets._commands + ", " + nncommand; 
                System.out.println(pets._commands);
                System.out.println("Команды, которые знает " + pets._name + ": " + pets._commands + "\n" );
                indicator1 = true;
                break;
            }
        }
        if (indicator1 == false){
            System.out.println("Введено неправильное имя!" + "\n");
            getCommands();
        }
        
    }


    public static void getCommands(){
        Scanner inname = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String nname = inname.nextLine().toUpperCase();
        boolean indicator1 = false;
        for (pets pets : arrayOfpPets) {
            if (pets._name.equals(nname)) {
                System.out.println("Команды, которые знает " + pets._name + ":" + pets._commands + "\n" );
                indicator1 = true;
                break;
            }
        }
        if (indicator1 == false){
            System.out.println("Введено неправильное имя!" + "\n");
            getCommands();
        }
        
    }
          

    public static int maxid() {
        ArrayList maxID = new ArrayList();
        for (pets pets : arrayOfpPets) {
            maxID.add(pets._ID);
            
        }
        int x = (int) maxID.get(maxID.size()-1);
        return x;
    }
    
}
