package day118_BackendLLDDesignPatternsBuilder;

public class P1_StudentBuilder {
    int age;
    String name;
    String batch;
    int gradyear;
    String course;

    public P1_StudentBuilder setAge(int age) {
        this.age = age;
        return this; //like this if this mtd called it will set and return this class object itself.
    }

    public P1_StudentBuilder setBatch(String batch) {
        this.batch = batch;
        return this;
    }

    public P1_StudentBuilder setCourse(String course) {
        this.course = course;
        return this;
    }

    public P1_StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public P1_StudentBuilder setGradyear(int gradyear) {
        this.gradyear = gradyear;
        return this;
    }

    public P1_Student build(){
    	/**
    	 * These validations we had to add in student class because kaam to usi ka kr rhe h na.. 
    	 * pr yha pr y build() bnaya jo student class ko return kr rha h.. this will act like terminal mtd
    	 * so why not move all the validations here.
    	 */

        // validations.. so these things were mandatory.. otherwise it will throw exp.
        if(this.age<10){
            throw new IllegalArgumentException("Age must be atleast 10");
        }

        if(this.gradyear>2024){
            throw new IllegalArgumentException("GradYear must smaller than 2024");
        }

        if(this.name==null){
            throw new IllegalArgumentException("Name can't be empty");
        }
        
        //For some variables we can set default value if we do not provide.. like if(happens) else{value=something} condition..
        //for non mandatory leave it.
        return new P1_Student(this);//this--> StudentBuilder
    }
}