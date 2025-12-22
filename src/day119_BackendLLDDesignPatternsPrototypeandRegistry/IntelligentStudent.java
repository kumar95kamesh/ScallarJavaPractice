package day119_BackendLLDDesignPatternsPrototypeandRegistry;

import java.util.ArrayList;

public class IntelligentStudent extends Student {
    int iq;
    ArrayList<Integer> list;

    IntelligentStudent(){

    }

    IntelligentStudent(IntelligentStudent is){//copy constructor
        super(is);
        this.iq = is.iq;
    }

    @Override
    public IntelligentStudent copy(){
        IntelligentStudent it = new IntelligentStudent(this);//uper ka constructor hi h
        return it;
    }
}