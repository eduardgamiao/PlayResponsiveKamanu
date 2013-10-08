package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.Index;
import views.html.Page1;
import views.html.pueo;
import views.html.aukahi;
import views.html.v6;
import views.html.about;



/**
 * Implements the controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page. 
   * @return The resulting home page. 
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }
  
  /**
   * Returns page1, a simple example of a second page to illustrate navigation.
   * @return The Page1.
   */
  public static Result page1() {
    return ok(Page1.render("Welcome to Page1."));
    
  }
  
  /**
   * Returns pueo page, a page about the pueo.
   * @return The pueo.
   */
  public static Result pueo() {
    return ok(pueo.render("Welcome to the Pueo page."));
    
  }
  
  /**
   * Returns aukahi page, a page about the aukahi.
   * @return The aukahi page.
   */
  public static Result aukahi() {
    return ok(aukahi.render("Welcome to the Aukahi page."));
    
  }
  
  /**
   * Returns V6 page, a page about the Kamanu V6.
   * @return The V6 page.
   */
  public static Result v6() {
    return ok(v6.render("Welcome to the V6 page."));
    
  }
  
  /**
   * Returns about page, a page about the about.
   * @return The about page.
   */
  public static Result about() {
    return ok(about.render("Welcome to the About page."));
    
  }
}
