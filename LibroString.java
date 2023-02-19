
public class LibroString{
		public static void main(String[] args){
			//Metodo .length//
			var Si = "Hola Soy Eder";
			int x1 = Si.length();
			System.out.println("La longitud es: " + x1);
			System.out.println("----------");
			//Metodo isEmpty//
			var s1 = "Hola";
			var s2 = "";
			boolean b1 = s1.isEmpty();
			System.out.println(b1);
			boolean b2 = s2.isEmpty();
			System.out.println(b2);
			System.out.println("----------");
			//Metodo equals//
			var x = "Rainbow 6";
			var y = "Rainbow 6";
			if(x.equals(y)) System.out.println("Si son iguales");
			System.out.println("---------------");
			//Metodo indexOf y lastIndexOf//
			var s = "Hola, como estas?";
			int p1 = s.indexOf('a');
			int p2 = s.lastIndexOf('a');
			System.out.println(p1);
			System.out.println(p2);
			System.out.println("----------");
			//Metodo upperCase y toLowerCase//
			var r = "Hola, como estas?";
			String may = r.toUpperCase();
			String min = r.toLowerCase();
			System.out.println(may);
			System.out.println(min);
			System.out.println("---------------");
			//Metodo subString//
			String ki = "Hola, como estas?";
			String d1 = ki.substring(0,4);
			String d2 = ki.substring(6,10);
			String d3 = ki.substring(11);
			System.out.println(d1);
			System.out.println(d2);
			System.out.println(d3);
			System.out.println("---------------");
			//Metodo parseInt y toString//
			//enteros//
			String t = "1234";
			int o = Integer.parseInt(t);
			String t1 = Integer.toString(o);
			System.out.println(o);
			System.out.println(t1);
			System.out.println("---------------");
			//flotantes//
			String t2 = "1234.56";
			double d = Double.parseDouble(t2);
			String t3 = Double.toString(d);
			System.out.println(d);
			System.out.println(t3);
			System.out.println("---------------");
			//metodo StringBuilder//
			StringBuilder sb = new StringBuilder("Hola, Soy Eder");
			sb.setCharAt(7, 'X');
			System.out.println(sb);
		}
}

