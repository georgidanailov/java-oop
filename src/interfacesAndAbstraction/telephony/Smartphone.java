package interfacesAndAbstraction.telephony;

import java.util.List;

public class Smartphone implements Callable, Browsable  {

    private List<String> number;
    private List<String> urls;

    public Smartphone(List<String> number, List<String> urls) {
        this.number = number;
        this.urls = urls;
    }


    @Override
    public String call() {
        return "";
    }

    @Override
    public String browse() {
        return "";
    }
}
