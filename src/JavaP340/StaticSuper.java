package JavaP340;

class StaticSuper {
    static {
        // 1 этап выполнения кода
        System.out.println("Родительский статический блок");
    }
    StaticSuper () {
        // 5 этап выполнения кода
        System.out.println("Родительский конструктор");
    }
}
