import java.util.Scanner;

/** Создайте boolean метод, который запросит у пользователя поля: login, password и confirm password
Логин должен содержать только символы: a, b, c, d, e, 0,1, _, если это не так нужно бросить RuntimeException с соответствующим сообщением.
Логин должен быть не меньше 4 и не больше 8 символов, если это не так нужно бросить RuntimeException с соответствующим сообщением.
Пароль должен быть не меньше 4 и не больше 8 символов и состоять только из цифр, если это не так нужно бросить RuntimeException с соответствующим сообщением.
Пароль и его повтор должны совпадать, если это не так нужно бросить RuntimeException с соответствующим сообщением.  */
// https://regex101.com/

public class Task04 {
    public static void main(String[] args) {
        userRegist();
    }
    public static boolean userRegist(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите логин (только a,b,c,d,e,0,1,_): ");
        String login = scanner.nextLine();
        if (!login.matches("[abcde01_]{4,8}")) { // логин содержит от 4 до 8 символов
            throw new RuntimeException("Login should contain only a, b, c, d, e, 0, 1, _");
        }
        System.out.print("Введите пароль (только цифры): ");
        String password = scanner.nextLine();
        if (!password.matches("[0-9]+{4,8}")) {
            throw new RuntimeException("Password should contain only digits");
        }
        System.out.print("Повторите пароль: ");
        String confirmPassword = scanner.nextLine();
        if(!password.equals(confirmPassword)){
            throw new RuntimeException("Password not equals");
        }
        return true;
    }
}
