

public class pets {
    public static int _ID;
    public static String _name;
    public static String _birthday;
    public static String _commands;
   

    public pets (int ID, String name, String birthday, String commands) {
        _ID = ID;
        _name = name;
        _birthday = birthday;
        _commands = commands;
        
    }
    
}

// public int getPetID(){
//     return pets._ID;
// }

// public void setName(String name){
//     this.name = pets._name;
// }

// public String getName(){
//     return pets._name;
// }

// public void setBirthday(LocalDate date) {
//     this.birthday = pets._birthday;
// }

// public String getBirthday(){
//     return pets._birthday;
// // }
// @Override
// public String toString() {
//     return String.format("%d. %s: имя: %s, дата рождения: %s ", getPetID(), getClass().getSimpleName(), name, getBirthday());
// }