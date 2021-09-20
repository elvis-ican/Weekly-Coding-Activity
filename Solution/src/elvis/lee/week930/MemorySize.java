package elvis.lee.week930;

public class MemorySize {

    public static String actualMemorySize(String s) {
        if (s == null || s.length() < 2) {
            return null;
        }
        String unit = s.substring(s.length()-2);
        double d = Double.parseDouble(s.substring(0,s.length()-2));
        boolean isSmall = false;
        if ((unit.equalsIgnoreCase("GB") && d < 1) ||
                (unit.equalsIgnoreCase("MB") && d < 1024)) {
            isSmall = true;
        }
        d = isSmall ? Math.round(d * .93) : Math.round(d * .93 * 100)/100.0;
        String result = isSmall ? (int)d + unit : d + unit;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(actualMemorySize("32GB")); // 29.76GB
        System.out.println(actualMemorySize("2GB")); // 1.86GB
        System.out.println(actualMemorySize("512MB")); // 476MB
    }
}
