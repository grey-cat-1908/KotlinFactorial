import javax.swing.JOptionPane.showInputDialog
import javax.swing.JOptionPane.showMessageDialog
import javax.swing.JOptionPane.PLAIN_MESSAGE

fun factorial(n: Int): Double = if (n < 2) 1.0 else n * factorial(n - 1)

val res =  showInputDialog(null,
        "Введите число",
        "Факториал", PLAIN_MESSAGE);

fun main() {
    if (res == null) {
        System.exit(0);
    }
    var number = Integer.parseInt(res);
    var a = factorial(number);
    showMessageDialog(null, "Результат: " + Math.round(a), "Факториал", PLAIN_MESSAGE);
}
