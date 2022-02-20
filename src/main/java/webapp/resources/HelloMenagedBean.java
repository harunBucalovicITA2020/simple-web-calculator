/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webapp.resources;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Harun
 */
@ManagedBean(name = "vozdraBean", eager = true)
@RequestScoped
public class HelloMenagedBean implements Serializable {

    public HelloMenagedBean() {
        super();
    }

    public String helloMessage() {
        return "Pozdrav iz HelloMenagedBean MODELA";
    }
}
