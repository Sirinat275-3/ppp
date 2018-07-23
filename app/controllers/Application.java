package controllers;

import models.Ice;
import play.api.templates.Html;
import play.mvc.*;

import views.html.*;

public class Application extends Controller {

    public static Result main(Html content) {
        return ok(main.render(content));}
        public static Result index() {return main(home.render());}
        public static Result oder() {return main(oder.render());}
    public static Result product() {return main(product.render());}
    public static Result pormotions() {return main(pormotions.render());}
    public static Result Girl() {return main(Girl.render());}

    public static Result pt () {

        Ice p1=new  Ice("p1","ชาเขียว","pp",50,10);
        Ice p2 = new  Ice("p2", "ชาเย็น", "pp", 40, 10);
        Ice p3 = new  Ice("p3", "ช็อคโกแลค", "pp", 50, 15);
        Ice p4 = new  Ice("p4", "ชาโค", "pp", 80, 15);
        Ice p5 = new  Ice("p5", "ผสม", "pp", 70, 10);
        Ice p6 = new  Ice("p6", "ผสมแบบอื่นๆ", "pp", 100, 10);
        return main(pt.render(p1,p2,p3,p4,p5,p6));
    }
    public static Result inputCandy() {return main(inputCandy.render());}
}

