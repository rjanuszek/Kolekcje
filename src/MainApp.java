import java.util.*;

public class MainApp {
    public static void main(String[] args) {

//        LEKCJA 1

//        List<String> names = new ArrayList<>();
//        List<String> names1 = new ArrayList<>();

//        names.add("Tomek");
//        names.add("Ola");
//        names.add("Michał");
//        names.add("Pola");
//
//        names1.add("Asia");
//        names1.add("Michał");

//        System.out.println(names);
//        for (String name : names) {
//            System.out.println(name);
//        }

//        names.remove(0);
//        names.remove("Tomek");
//        System.out.println(names);

//        String name = names.get(1);
//        System.out.println(name);

//        System.out.println(names.size());

//        System.out.println(names.isEmpty());
//        System.out.println(names.contains("Michał"));

//        names.addAll(names1);
//        System.out.println(names);

//        names.removeAll(names1);
//        System.out.println(names);

//        Collections.sort(names);
//        System.out.println(names);
//
//        Collections.reverse(names);
//        System.out.println(names);

//        LEKCJA 2

//        List<User> users = new ArrayList<>();
//
//        users.add(new User("Rafaela", "Testowa", "wp@com.pl", 25));
//        users.add(new User("Tomek", "Kowalski", "onet@com.pl", 30));
//        users.add(new User("Bartek", "Nowak", "interia@com.pl", 15));
//        users.add(new User("Joanna", "Wiśniewska", "wp@com.pl", 18));
//
//        for (User user : users) {
//            System.out.println(user.getFirstName());
//        }

//        Collections.sort(users, Comparator.comparing(User::getFirstName));
//        System.out.println(users);
//
//        Collections.sort(users, Comparator.comparingInt(User::getAge).reversed());
//        for (User user : users
//        ) {
//            System.out.println(user.getFirstName() + " " + user.getAge());
//        }

//        LEKCJA 3

//        List<String> names1 = new ArrayList<>();
//        List<String> names2 = new LinkedList<>();
//
//        names1.add("Bartek");
//        names2.add("Bartek");

//        LEKCJA 4

//        Set<String> names = new TreeSet<>();

//        names.add("Rafał");
//        names.add("Agnieszka");
//        names.add("Agnieszka");
//        names.add("Ula");

//        System.out.println(names.size());
//
//        for (String name: names){
//            System.out.println(name);
//        }

//        Set<String> sortedNames = new TreeSet<>(names);
//
//        for (String name: sortedNames){
//            System.out.println(name);
//        }

//        Set<String> sortedNames = new TreeSet<>(names);

//        for (String name: names){
//            System.out.println(name);
//        }

//        LEKCJA 5

//        Set<User> users = new HashSet<>();
//        users.add(new User("Rafał", "Testowy", "wp@wp.pl", 20));
//        users.add(new User("Rafał", "Jan", "onet@wp.pl", 25));
//        users.add(new User("Rafał", "Jan", "onet@wp.pl", 25));
//        users.add(new User("Agnieszka", "Wakacje", "wp@wp.pl", 30));
//        users.add(new User("Pola", "Nowak", "interia@wp.pl", 35));
//        users.add(new User("Michał", "Kowalski", "wp@wp.pl", 40));

//        System.out.println(users.size());

//        for (User user : users) {
//            System.out.println(user.getFirstName() + " " + user.getLastName());
//        }

//        Set<User> users = new HashSet<>();
//        users.add(new User("Rafał", "Testowy", "wp@wp.pl", 20));
//        users.add(new User("Rafał", "Jan", "onet@wp.pl", 25));
//        users.add(new User("Rafał", "Jan", "onet@wp.pl", 25));
//        users.add(new User("Agnieszka", "Wakacje", "wp@wp.pl", 30));
//        users.add(new User("Pola", "Nowak", "interia@wp.pl", 35));
//        users.add(new User("Michał", "Kowalski", "wp@wp.pl", 40));
//
//        Set<User> sortedUser = new TreeSet<>(users);
//        for (User user : sortedUser) {
//            System.out.println(user.getFirstName() + " " + user.getLastName());
//        }

//        LEKCJA 6

//        Map<Integer, String> names = new HashMap<>();
////        Map<Integer, String> names = new LinkedHashMap<>();
//
//        names.put(1, "Bartek");
//        names.put(20, "Roman");
//        names.put(5, "Agnieszka");
//        names.put(4, "Roman");
//        names.put(2, "Roman");
//
////        System.out.println(names);
//
//        Map<Integer, String> sortedNames = new TreeMap<>(names);
//        System.out.println(sortedNames);
//
//        for (Map.Entry<Integer, String> entry: names.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }

//        ZADANIE DOMOWE

        List<Bug> bugList = new ArrayList<>();

        bugList.add(new Bug("Problem z logowaniem",
                new BugReporter("Rafaela", "Januszek", "wp@com.pl"), 1));
        bugList.add(new Bug("Problem z logowaniem",
                new BugReporter("Rafaela", "Januszek", "wp@com.pl"), 1));
        bugList.add(new Bug("Problem z walidacją",
                new BugReporter("Ola", "Nowak", "onet@com.pl"), 3));
        bugList.add(new Bug("Brak checkboxa",
                new BugReporter("Bartek", "Januszek", "interia@com.pl"), 4));
        bugList.add(new Bug("Błąd serwera",
                new BugReporter("Rafaela", "Januszek", "gmial@com.pl"), 5));


        System.out.println("---SET---");
        Set<Bug> bugsSet = new HashSet<>(bugList);
        for (Bug bugs : bugsSet
        ) {
            System.out.println(bugs.getDescriptionBug());
        }

        System.out.println("---TREESET---");
        Set<Bug> bugSort = new TreeSet<>(bugsSet);
        for (Bug bugs : bugSort) {
            System.out.println(bugs.getDescriptionBug());
        }
    }

}
