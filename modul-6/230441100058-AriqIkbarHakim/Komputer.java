package komputer;

interface Mouse {
    public void klikKiri();
    public void klikKanan();
}
interface Keyboard {
    public void tekanEnter();
}
interface Printer {
    public void cetakData();
}
abstract class Komputer implements Mouse, Keyboard, Printer {
    abstract void hidupkan_os();
    abstract void hidupkan_os(String OSnama);
    abstract void matikan_os();
    abstract void matikan_os(String OS);
}

