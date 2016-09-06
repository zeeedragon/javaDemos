package interfacesDemo;

public class Data {
    public static double avg(Measurable... arr) {
        double sum = 0;
        for (Measurable item : arr) {
            sum += item.getMeasure();
        }
        if (arr.length > 0) {
            return sum / arr.length;
        } else {
            return 0;
        }
    }

    public static Measurable greater(Measurable a, Measurable b) {
        if (a.getMeasure() > b.getMeasure()) {
            return a;
        } else {
            return b;
        }
    }

    public static Measurable max(Measurable... arr) {
        Measurable greatestItem = arr[0];
        for (Measurable item : arr) {
            if (item.getMeasure() > greatestItem.getMeasure()) {
                greatestItem = item;
            }
        }
        return greatestItem;
    }

    public static Object min(MeasBack meas, Object... obj) { //using Object to make sure we can take Object of any class/type
        Object minItem = obj[0];
        for (Object item : obj) {
            if (meas.measure(item) < meas.measure(minItem)) {
                minItem = item;
            }
        }
        return minItem;
    }
}
