package controllers;

import models.Ice;
import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import scala.math.Ordering;
import views.html.*;

import javax.servlet.FilterRegistration;

public class Application extends Controller {

    public static Result main(Html content) {return ok(main.render(content));}
    public static Result index() {return main(home.render());}
    public static Result oder() {return main(oder.render());}
    public static Result product() {return main(product.render());}
    public static Result pormotions() {return main(pormotions.render());}
    public static Result Girl() {return main(Girl.render());}
    public static Result inputIce() {return main(inputIce.render());}
    public static Result sirinat() {return main(sirinat.render());}
    public static Result water() {return main(water.render());}



    public static Result PostIce(){
        DynamicForm myForm = Form.form().bindFromRequest();
        //Ice Ice = new Ice ();
        String id, name, brand, number,size;
        double price;
        if (myForm.hasErrors()){
            return main(inputIce.render());
        } else {
            id = myForm.get("id");
            name = myForm.get("name");
            brand = myForm.get("brand");
            number = myForm.get("number");
            size = myForm.get("size");
            price = Double.parseDouble(myForm.get("price"));
            Ice Ice = new Ice(id, name, brand, number,size,price);
            return main(showOutput.render(Ice));
        }
    }
    public static Result pt () {

        Ice p1=new  Ice("p1","ชาเขียว","pp","50","s,m,l",10);
        Ice p2 = new  Ice("p2", "ชาเย็น", "pp", "40","s,m,l", 10);
        Ice p3 = new  Ice("p3", "ช็อคโกแลค", "pp"," 50","s,m,l", 15);
        Ice p4 = new  Ice("p4", "ชาโค", "pp", "80","s,m,l", 15);
        Ice p5 = new  Ice("p5", "ผสม", "pp", "70","s,m,l", 10);
        Ice p6 = new  Ice("p6", "ผสมแบบอื่นๆ", "pp", "100","s,m,l", 10);
        Ice s1 = new  Ice("00", "ไอศรีม", "opp", "1000","s,m,l", 20);
        Ice o1 = new  Ice ("01","s,m,l","ppp","100","s,m,l",30);

        return main(pt.render(p1,p2,p3,p4,p5,p6,s1,o1));
    }


    }


