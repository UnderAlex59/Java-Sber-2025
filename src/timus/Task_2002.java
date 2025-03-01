package timus;

import java.util.*;

public class Task_2002 {
    public static void main(String[] args) {
        ForumRegistation forumRegistation = new ForumRegistation();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] in = scanner.nextLine().split(" ");
            ArrayList<String> input = new ArrayList<>();
            input.add(in[0]);
            input.add(in[1]);
            if(in.length == 2) input.add("");
            else input.add(in[2]);
            System.out.println(forumRegistation.operationList.stream().filter(x -> x.getOperationName().equals(input.get(0))).findFirst().get().apply(new String[]{input.get(1), input.get(2)}));
        }
        scanner.close();

    }

    abstract static class Operation{
        String operationName;
        HashMap<String, String> users;

        abstract public String apply(String[] input);

        public String getOperationName(){
            return this.operationName;
        }

        public Boolean userIn (String name){
            return users.containsKey(name);
        }


    }

    static class ForumRegistation{
        HashMap<String, String> users = new HashMap<>();;
        ArrayList<String> usersInSystem = new ArrayList<>();;
        Registration registration = new Registration(users);
        Authorization authorization = new Authorization(registration);
        Logout logout = new Logout(authorization);
        ArrayList<? extends Operation> operationList = new ArrayList(){{
            add(registration);
            add(authorization);
            add(logout);
        }};


        static class Registration extends Operation{

            Registration(HashMap<String, String> users){
                this.users = users;
                this.operationName = "register";
            }
            @Override
            public String apply(String[] input){
                String name = input[0];
                String password = input[1];
                if (this.userIn(name)){
                    return ("fail: user already exists");
                }
                else {
                    users.put(name, password);
                    return ("success: new user added");
                }
            }

        }

        static class Authorization extends Operation{
            ArrayList<String> userInSystem;
            Authorization(Registration registration){
                this.operationName = "login";
                this.users = registration.users;
                this.userInSystem = new ArrayList<>();
            }

            @Override
            public String apply(String[] input) {
                String name = input[0];
                String password = input[1];
                if (!this.userIn(name)){
                    return "fail: no such user";
                }
                else if (!users.get(name).equals(password)){
                    return "fail: incorrect password";
                }
                else if (this.isUserLogin(name)){
                    return "fail: already logged in";
                }
                else{
                    userInSystem.add(name);
                    return "success: user logged in";
                }
            }

            public Boolean isUserLogin(String name){
                return userInSystem.contains(name);
            }
        }

        static class Logout extends Operation{
            ArrayList<String> userInSystem;
            Logout(Authorization authorization){
                this.userInSystem = authorization.userInSystem;
                this.operationName = "logout";
                this.users = authorization.users;
            }

            @Override
            public String apply(String[] input) {
                String name = input[0];
                if (!this.userIn(name)){
                    return "fail: no such user";
                }
                else if (!userInSystem.contains(name)){
                    return "fail: already logged out";
                }
                else {
                    userInSystem.remove(name);
                    return "success: user logged out";
                }
            }
        }
    }

}
