package test

class App {

    String getGreeting() {
        return 'Hello World gradle!'
    }

    static void main(String[] args) {
        println new App().greeting
    }

}
