package calculadora;

import javax.swing.JOptionPane;

class Calculadora {

	public static void main(String[] args) {
		double n1, n2, suma, rest, mult, divi;
		int op;
		String res;
		do {
			JOptionPane.showMessageDialog(null, "Bienvenido a la calculadora, en esta ocasión tienes que ingresar dos números y luego \ntendrás que elegir la operación ingresando su número de identificación correspondiente.");
			n1=Double.parseDouble(JOptionPane.showInputDialog("Ingresá un número."));
			n2=Double.parseDouble(JOptionPane.showInputDialog("Ingresá un número."));
			op=Integer.parseInt(JOptionPane.showInputDialog("Ingresá la operación, solo su número de identificación: \n1-Suma \n2-Resta \n3-Multiplicación \n4-División"));
			switch (op) {
			case 1:
				suma=n1+n2;
				JOptionPane.showMessageDialog(null, "La suma es: " + suma);
				break;
			case 2:
				rest=n1-n2;
				JOptionPane.showMessageDialog(null, "La resta es: " + rest);
				break;
			case 3:
				mult=n1*n2;
				JOptionPane.showMessageDialog(null, "La multiplicación es: " + mult);
				break;
			case 4:
				if (n2!=0) {
					divi=n1/n2;
					JOptionPane.showMessageDialog(null, "La división es: " + divi);
				} else {
					JOptionPane.showMessageDialog(null, "Error: no se puede dividir por 0.");
					}
				break;
			default:
				JOptionPane.showMessageDialog(null, "Error: operación no encontrada.");
				break;
			}
			res=JOptionPane.showInputDialog("¿Desea ingresar otra operación? Si o no.");
		} while (res.equalsIgnoreCase("si"));
		}}