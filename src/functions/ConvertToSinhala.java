/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package functions;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sameera
 */
public class ConvertToSinhala {
    
    public static String convert(String text){       
        
        try {
            //        String text1 = new String(bytes, Charsets.UTF_8);
            
            
            
            text = text.replace("x", "&#x0D82");

            text = text.replace("nndhaea", "&#x0DB3&#x0DD1");

            text = text.replace("nndhoa", "&#x0DB3&#x0DDD");
            text = text.replace("nndhea", "&#x0DB3&#x0DDA");
            text = text.replace("nndhuu", "&#x0DB3&#x0DD6");
            text = text.replace("nndhii", "&#x0DB3&#x0DD3");
            text = text.replace("nndhee", "&#x0DB3&#x0DD3");
            text = text.replace("nndhaa", "&#x0DB3&#x0DCF");
            text = text.replace("nndhae", "&#x0DB3&#x0DD0");

            text = text.replace("nngaea", "&#x0D9F&#x0DD1");
            text = text.replace("nngroo", "&#x0D9F&#x0DF2");
            text = text.replace("nngaea", "&#x0D9F&#x0DD1");

            text = text.replace("nndaea", "&#x0DAC&#x0DD1");
            text = text.replace("nndroo", "&#x0DAC&#x0DF2");
            text = text.replace("nndaea", "&#x0DAC&#x0DD1");
            text = text.replace("nndaea", "&#x0DAC&#x0DD1");
            text = text.replace("nndroo", "&#x0DAC&#x0DF2");
            text = text.replace("nndaea", "&#x0DAC&#x0DD1");

            text = text.replace("nndhi", "&#x0DB3&#x0DD2");
            text = text.replace("nndhu", "&#x0DB3&#x0DD4");
            text = text.replace("nndhe", "&#x0DB3&#x0DD9");
            text = text.replace("nndho", "&#x0DB3&#x0DDC");

            text = text.replace("nngaa", "&#x0D9F&#x0DCF");
            text = text.replace("nngae", "&#x0D9F&#x0DD0");
            text = text.replace("nngii", "&#x0D9F&#x0DD3");
            text = text.replace("nngee", "&#x0D9F&#x0DD3");
            text = text.replace("nnguu", "&#x0D9F&#x0DD6");
            text = text.replace("nngru", "&#x0D9F&#x0DD8");
            text = text.replace("nngea", "&#x0D9F&#x0DDA");
            text = text.replace("nngai", "&#x0D9F&#x0DDB");
            text = text.replace("nngoa", "&#x0D9F&#x0DDD");
            text = text.replace("nngau", "&#x0D9F&#x0DDF");

            text = text.replace("nndaa", "&#x0DAC&#x0DCF");
            text = text.replace("nndae", "&#x0DAC&#x0DD0");
            text = text.replace("nndii", "&#x0DAC&#x0DD3");
            text = text.replace("nndee", "&#x0DAC&#x0DD3");
            text = text.replace("nnduu", "&#x0DAC&#x0DD6");
            text = text.replace("nndru", "&#x0DAC&#x0DD8");
            text = text.replace("nndea", "&#x0DAC&#x0DDA");
            text = text.replace("nndai", "&#x0DAC&#x0DDB");
            text = text.replace("nndoa", "&#x0DAC&#x0DDD");
            text = text.replace("nndau", "&#x0DAC&#x0DDF");
            
            text = text.replace("nndha", "&#x0DB3");

            text = text.replace("chruu", "&#x0DA0&#x0DF2");
            text = text.replace("chroo", "&#x0DA0&#x0DF2");
            text = text.replace("chaea", "&#x0DA0&#x0DD1");
            text = text.replace("Chruu", "&#x0DA1&#x0DF2");
            text = text.replace("Chroo", "&#x0DA1&#x0DF2");
            text = text.replace("Chaea", "&#x0DA1&#x0DD1");

            text = text.replace("thruu", "&#x0DAD&#x0DF2");
            text = text.replace("throo", "&#x0DAD&#x0DF2");
            text = text.replace("thaea", "&#x0DAD&#x0DD1");

            text = text.replace("Thruu", "&#x0DAE&#x0DF2");
            text = text.replace("Throo", "&#x0DAE&#x0DF2");
            text = text.replace("Thaea", "&#x0DAE&#x0DD1");

            text = text.replace("dhaii", "&#x0DAF&#x0DD3");
            text = text.replace("dhaee", "&#x0DAF&#x0DD3");
            text = text.replace("dhruu", "&#x0DAF&#x0DF2");
            text = text.replace("dhroo", "&#x0DAF&#x0DF2");
            text = text.replace("dhaea", "&#x0DAF&#x0DD1");

            text = text.replace("Dhaii", "&#x0DB0&#x0DD3");
            text = text.replace("Dhaee", "&#x0DB0&#x0DD3");
            text = text.replace("Dhruu", "&#x0DB0&#x0DF2");
            text = text.replace("Dhroo", "&#x0DB0&#x0DF2");
            text = text.replace("Dhaea", "&#x0DB0&#x0DD1");

            text = text.replace("shaea", "&#x0DC1&#x0DD1");

            text = text.replace("Shaea", "&#x0DC2&#x0DD1");

            text = text.replace("shaa", "&#x0DC1&#x0DCF");
            text = text.replace("shae", "&#x0DC1&#x0DD0");
            text = text.replace("shii", "&#x0DC1&#x0DD3");
            text = text.replace("shuu", "&#x0DC1&#x0DD6");
            text = text.replace("shea", "&#x0DC1&#x0DDA");
            text = text.replace("shoa", "&#x0DC1&#x0DDD");

            text = text.replace("Shaa", "&#x0DC2&#x0DCF");
            text = text.replace("Shae", "&#x0DC2&#x0DD0");
            text = text.replace("Shii", "&#x0DC2&#x0DD3");
            text = text.replace("Shuu", "&#x0DC2&#x0DD6");
            text = text.replace("Shea", "&#x0DC2&#x0DDA");
            text = text.replace("Shoa", "&#x0DC2&#x0DDD");

            text = text.replace("nngi", "&#x0D9F&#x0DD2");
            text = text.replace("nngu", "&#x0D9F&#x0DD4");
            text = text.replace("nnge", "&#x0D9F&#x0DD9");
            text = text.replace("nngo", "&#x0D9F&#x0DDC");

            text = text.replace("nndi", "&#x0DAC&#x0DD2");
            text = text.replace("nndu", "&#x0DAC&#x0DD4");
            text = text.replace("nnde", "&#x0DAC&#x0DD9");
            text = text.replace("nndo", "&#x0DAC&#x0DDC");

            text = text.replace("chae", "&#x0DA0&#x0DD0");
            text = text.replace("chaa", "&#x0DA0&#x0DCF");
            text = text.replace("chau", "&#x0DA0&#x0DD6");
            text = text.replace("chru", "&#x0DA0&#x0DD8");
            text = text.replace("chea", "&#x0DA0&#x0DDA");
            text = text.replace("chai", "&#x0DA0&#x0DDB");
            text = text.replace("choa", "&#x0DA0&#x0DDD");
            text = text.replace("chau", "&#x0DA0&#x0DDE");
            text = text.replace("chii", "&#x0DA0&#x0DD3");
            text = text.replace("chee", "&#x0DA0&#x0DD3");
            text = text.replace("chuu", "&#x0DA0&#x0DD6");

            text = text.replace("Chae", "&#x0DA1&#x0DD0");
            text = text.replace("Chaa", "&#x0DA1&#x0DCF");
            text = text.replace("Chau", "&#x0DA1&#x0DD6");
            text = text.replace("Chru", "&#x0DA1&#x0DD8");
            text = text.replace("Chea", "&#x0DA1&#x0DDA");
            text = text.replace("Chai", "&#x0DA1&#x0DDB");
            text = text.replace("Choa", "&#x0DA1&#x0DDD");
            text = text.replace("Chau", "&#x0DA1&#x0DDE");
            text = text.replace("Chii", "&#x0DA1&#x0DD3");
            text = text.replace("Chee", "&#x0DA1&#x0DD3");
            text = text.replace("Chuu", "&#x0DA1&#x0DD6");

            text = text.replace("thae", "&#x0DAD&#x0DD0");
            text = text.replace("thaa", "&#x0DAD&#x0DCF");
            text = text.replace("thau", "&#x0DAD&#x0DD6");
            text = text.replace("thru", "&#x0DAD&#x0DD8");
            text = text.replace("thea", "&#x0DAD&#x0DDA");
            text = text.replace("thai", "&#x0DAD&#x0DDB");
            text = text.replace("thoa", "&#x0DAD&#x0DDD");
            text = text.replace("thau", "&#x0DAD&#x0DDE");
            text = text.replace("thii", "&#x0DAD&#x0DD3");
            text = text.replace("thee", "&#x0DAD&#x0DD3");
            text = text.replace("thuu", "&#x0DAD&#x0DD6");

            text = text.replace("Thae", "&#x0DAE&#x0DD0");
            text = text.replace("Thaa", "&#x0DAE&#x0DCF");
            text = text.replace("Thau", "&#x0DAE&#x0DD6");
            text = text.replace("Thru", "&#x0DAE&#x0DD8");
            text = text.replace("Thea", "&#x0DAE&#x0DDA");
            text = text.replace("Thai", "&#x0DAE&#x0DDB");
            text = text.replace("Thoa", "&#x0DAE&#x0DDD");
            text = text.replace("Thau", "&#x0DAE&#x0DDE");
            text = text.replace("Thii", "&#x0DAE&#x0DD3");
            text = text.replace("Thee", "&#x0DAE&#x0DD3");
            text = text.replace("Thuu", "&#x0DAE&#x0DD6");

            text = text.replace("dhae", "&#x0DAF&#x0DD0");
            text = text.replace("dhaa", "&#x0DAF&#x0DCF");
            text = text.replace("dhau", "&#x0DAF&#x0DD6");
            text = text.replace("dhru", "&#x0DAF&#x0DD8");
            text = text.replace("dhea", "&#x0DAF&#x0DDA");
            text = text.replace("dhai", "&#x0DAF&#x0DDB");
            text = text.replace("dhoa", "&#x0DAF&#x0DDD");
            text = text.replace("dhau", "&#x0DAF&#x0DDE");
            text = text.replace("dhii", "&#x0DAF&#x0DD3");
            text = text.replace("dhee", "&#x0DAF&#x0DD3");
            text = text.replace("dhuu", "&#x0DAF&#x0DD6");

            text = text.replace("Dhae", "&#x0DB0&#x0DD0");
            text = text.replace("Dhaa", "&#x0DB0&#x0DCF");
            text = text.replace("Dhau", "&#x0DB0&#x0DD6");
            text = text.replace("Dhru", "&#x0DB0&#x0DD8");
            text = text.replace("Dhea", "&#x0DB0&#x0DDA");
            text = text.replace("Dhai", "&#x0DB0&#x0DDB");
            text = text.replace("Dhoa", "&#x0DB0&#x0DDD");
            text = text.replace("Dhau", "&#x0DB0&#x0DDE");
            text = text.replace("Dhii", "&#x0DB0&#x0DD3");
            text = text.replace("Dhee", "&#x0DB0&#x0DD3");
            text = text.replace("Dhuu", "&#x0DB0&#x0DD6");

            text = text.replace("nnga", "&#x0D9F");
            text = text.replace("nnja", "&#x0DA6");
            text = text.replace("nnda", "&#x0DAC");
            text = text.replace("sruu", "&#x0D8E");
            text = text.replace("knna", "&#x0DA4");
            text = text.replace("gnna", "&#x0DA5");

            //===========================================

            text = text.replace("kaea", "&#x0D9A&#x0DD1");
            text = text.replace("kruu", "&#x0D9A&#x0DF2");
            text = text.replace("kroo", "&#x0D9A&#x0DF2");
            
            text = text.replace("Kruu", "&#x0D9B&#x0DF2");
            text = text.replace("Kroo", "&#x0D9B&#x0DF2");
            text = text.replace("Kaea", "&#x0D9B&#x0DD1");

            text = text.replace("gaea", "&#x0D9C&#x0DD1");
            text = text.replace("gruu", "&#x0D9C&#x0DF2");
            text = text.replace("groo", "&#x0D9C&#x0DF2");

            text = text.replace("Gaea", "&#x0D9D&#x0DD1");
            text = text.replace("Groo", "&#x0D9D&#x0DF2");
            text = text.replace("Gaea", "&#x0D9D&#x0DD1");

            text = text.replace("jaea", "&#x0DA2&#x0DD1");
            text = text.replace("jroo", "&#x0DA2&#x0DF2");
            text = text.replace("jaea", "&#x0DA2&#x0DD1");

            text = text.replace("taea", "&#x0DA7&#x0DD1");
            text = text.replace("troo", "&#x0DA7&#x0DF2");
            text = text.replace("taea", "&#x0DA7&#x0DD1");

            text = text.replace("Taea", "&#x0DA8&#x0DD1");
            text = text.replace("Troo", "&#x0DA8&#x0DF2");
            text = text.replace("Taea", "&#x0DA8&#x0DD1");

            text = text.replace("daea", "&#x0DA9&#x0DD1");
            text = text.replace("droo", "&#x0DA9&#x0DF2");
            text = text.replace("daea", "&#x0DA9&#x0DD1");

            text = text.replace("Daea", "&#x0DAA&#x0DD1");
            text = text.replace("Droo", "&#x0DAA&#x0DF2");
            text = text.replace("Daea", "&#x0DAA&#x0DD1");

            text = text.replace("Naea", "&#x0DAB&#x0DD1");
            text = text.replace("Nroo", "&#x0DAB&#x0DF2");
            text = text.replace("Naea", "&#x0DAB&#x0DD1");

            text = text.replace("naea", "&#x0DB1&#x0DD1");
            text = text.replace("nroo", "&#x0DB1&#x0DF2");
            text = text.replace("naea", "&#x0DB1&#x0DD1");

            text = text.replace("paea", "&#x0DB4&#x0DD1");
            text = text.replace("proo", "&#x0DB4&#x0DF2");
            text = text.replace("paea", "&#x0DB4&#x0DD1");

            text = text.replace("Paea", "&#x0DB5&#x0DD1");
            text = text.replace("Proo", "&#x0DB5&#x0DF2");
            text = text.replace("Paea", "&#x0DB5&#x0DD1");

            text = text.replace("baea", "&#x0DB6&#x0DD1");
            text = text.replace("broo", "&#x0DB6&#x0DF2");
            text = text.replace("baea", "&#x0DB6&#x0DD1");

            text = text.replace("Baea", "&#x0DB7&#x0DD1");
            text = text.replace("Broo", "&#x0DB7&#x0DF2");
            text = text.replace("Baea", "&#x0DB7&#x0DD1");

            text = text.replace("maea", "&#x0DB8&#x0DD1");
            text = text.replace("mroo", "&#x0DB8&#x0DF2");
            text = text.replace("maea", "&#x0DB8&#x0DD1");

            text = text.replace("Maea", "&#x0DB9&#x0DD1");
            text = text.replace("Mroo", "&#x0DB9&#x0DF2");
            text = text.replace("Maea", "&#x0DB9&#x0DD1");

            text = text.replace("yaea", "&#x0DBA&#x0DD1");
            text = text.replace("yroo", "&#x0DBA&#x0DF2");
            text = text.replace("yaea", "&#x0DBA&#x0DD1");

            text = text.replace("raea", "&#x0DBB&#x0DD1");
            text = text.replace("rroo", "&#x0DBB&#x0DF2");
            text = text.replace("raea", "&#x0DBB&#x0DD1");

            text = text.replace("laea", "&#x0DBD&#x0DD1");
            text = text.replace("lroo", "&#x0DBD&#x0DF2");
            text = text.replace("laea", "&#x0DBD&#x0DD1");

            text = text.replace("vaea", "&#x0DC0&#x0DD1");
            text = text.replace("vroo", "&#x0DC0&#x0DF2");
            text = text.replace("vaea", "&#x0DC0&#x0DD1");

            text = text.replace("saea", "&#x0DC3&#x0DD1");
            text = text.replace("sroo", "&#x0DC3&#x0DF2");
            text = text.replace("saea", "&#x0DC3&#x0DD1");

            text = text.replace("haea", "&#x0DC4&#x0DD1");
            text = text.replace("hroo", "&#x0DC4&#x0DF2");
            text = text.replace("haea", "&#x0DC4&#x0DD1");

            text = text.replace("Laea", "&#x0DC5&#x0DD1");
            text = text.replace("Lroo", "&#x0DC5&#x0DF2");
            text = text.replace("Laea", "&#x0DC5&#x0DD1");

            text = text.replace("faea", "&#x0DC6&#x0DD1");
            text = text.replace("froo", "&#x0DC6&#x0DF2");
            text = text.replace("faea", "&#x0DC6&#x0DD1");

            //===========================================

            text = text.replace("Cha", "&#x0DA1");
            text = text.replace("cha", "&#x0DA0");
            text = text.replace("sru", "&#x0D8D");
            text = text.replace("aea", "&#x0D88");
            text = text.replace("tha", "&#x0DAD");
            text = text.replace("Tha", "&#x0DAE");
            text = text.replace("dha", "&#x0DAF");
            text = text.replace("Dha", "&#x0DB0");
            text = text.replace("sha", "&#x0DC1");
            text = text.replace("Sha", "&#x0DC2");

            text = text.replace("chi", "&#x0DA0&#x0DD2");
            text = text.replace("chu", "&#x0DA0&#x0DD4");
            text = text.replace("che", "&#x0DA0&#x0DD9");
            text = text.replace("cho", "&#x0DA0&#x0DDC");

            text = text.replace("Chi", "&#x0DA1&#x0DD2");
            text = text.replace("Chu", "&#x0DA1&#x0DD4");
            text = text.replace("Che", "&#x0DA1&#x0DD9");
            text = text.replace("Cho", "&#x0DA1&#x0DDC");

            text = text.replace("thi", "&#x0DAD&#x0DD2");
            text = text.replace("thu", "&#x0DAD&#x0DD4");
            text = text.replace("the", "&#x0DAD&#x0DD9");
            text = text.replace("tho", "&#x0DAD&#x0DDC");

            text = text.replace("Thi", "&#x0DAE&#x0DD2");
            text = text.replace("Thu", "&#x0DAE&#x0DD4");
            text = text.replace("The", "&#x0DAE&#x0DD9");
            text = text.replace("Tho", "&#x0DAE&#x0DDC");

            text = text.replace("dhi", "&#x0DAF&#x0DD2");
            text = text.replace("dhu", "&#x0DAF&#x0DD4");
            text = text.replace("dhe", "&#x0DAF&#x0DD9");
            text = text.replace("dho", "&#x0DAF&#x0DDC");

            text = text.replace("Dhi", "&#x0DB0&#x0DD2");
            text = text.replace("Dhu", "&#x0DB0&#x0DD4");
            text = text.replace("Dhe", "&#x0DB0&#x0DD9");
            text = text.replace("Dho", "&#x0DB0&#x0DDC");

            text = text.replace("shi", "&#x0DC1&#x0DD2");
            text = text.replace("shu", "&#x0DC1&#x0DD4");
            text = text.replace("she", "&#x0DC1&#x0DD9");
            text = text.replace("sho", "&#x0DC1&#x0DDC");

            text = text.replace("Shi", "&#x0DC2&#x0DD2");
            text = text.replace("Shu", "&#x0DC2&#x0DD4");
            text = text.replace("She", "&#x0DC2&#x0DD9");
            text = text.replace("Sho", "&#x0DC2&#x0DDC");

            //===========================================

            text = text.replace("kae", "&#x0D9A&#x0DD0");
            text = text.replace("kaa", "&#x0D9A&#x0DCF");
            text = text.replace("kii", "&#x0D9A&#x0DD3");
            text = text.replace("kee", "&#x0D9A&#x0DD3");
            text = text.replace("kuu", "&#x0D9A&#x0DD6");
            text = text.replace("kru", "&#x0D9A&#x0DD8");
            text = text.replace("kea", "&#x0D9A&#x0DDA");
            text = text.replace("kai", "&#x0D9A&#x0DDB");
            text = text.replace("koa", "&#x0D9A&#x0DDD");
            text = text.replace("kau", "&#x0D9A&#x0DDE");

            text = text.replace("Kaa", "&#x0D9B&#x0DCF");
            text = text.replace("Kae", "&#x0D9B&#x0DD0");
            text = text.replace("Kii", "&#x0D9B&#x0DD3");
            text = text.replace("Kee", "&#x0D9B&#x0DD3");
            text = text.replace("Kuu", "&#x0D9B&#x0DD6");
            text = text.replace("Kru", "&#x0D9B&#x0DD8");
            text = text.replace("Kea", "&#x0D9B&#x0DDA");
            text = text.replace("Kai", "&#x0D9B&#x0DDB");
            text = text.replace("Koa", "&#x0D9B&#x0DDD");
            text = text.replace("Kau", "&#x0D9B&#x0DDF");

            text = text.replace("jae", "&#x0DA2&#x0DD0");
            text = text.replace("jaa", "&#x0DA2&#x0DCF");
            text = text.replace("jii", "&#x0DA2&#x0DD3");
            text = text.replace("jee", "&#x0DA2&#x0DD3");
            text = text.replace("juu", "&#x0DA2&#x0DD6");
            text = text.replace("jru", "&#x0DA2&#x0DD8");
            text = text.replace("jea", "&#x0DA2&#x0DDA");
            text = text.replace("jai", "&#x0DA2&#x0DDB");
            text = text.replace("joa", "&#x0DA2&#x0DDD");
            text = text.replace("jau", "&#x0DA2&#x0DDE");

            text = text.replace("gaa", "&#x0D9C&#x0DCF");
            text = text.replace("gae", "&#x0D9C&#x0DD0");
            text = text.replace("gii", "&#x0D9C&#x0DD3");
            text = text.replace("gee", "&#x0D9C&#x0DD3");
            text = text.replace("guu", "&#x0D9C&#x0DD6");
            text = text.replace("gru", "&#x0D9C&#x0DD8");
            text = text.replace("gea", "&#x0D9C&#x0DDA");
            text = text.replace("gai", "&#x0D9C&#x0DDB");
            text = text.replace("goa", "&#x0D9C&#x0DDD");
            text = text.replace("gau", "&#x0D9C&#x0DDF");

            text = text.replace("Gaa", "&#x0D9D&#x0DCF");
            text = text.replace("Gae", "&#x0D9D&#x0DD0");
            text = text.replace("Gii", "&#x0D9D&#x0DD3");
            text = text.replace("Gee", "&#x0D9D&#x0DD3");
            text = text.replace("Guu", "&#x0D9D&#x0DD6");
            text = text.replace("Gru", "&#x0D9D&#x0DD8");
            text = text.replace("Gea", "&#x0D9D&#x0DDA");
            text = text.replace("Gai", "&#x0D9D&#x0DDB");
            text = text.replace("Goa", "&#x0D9D&#x0DDD");
            text = text.replace("Gau", "&#x0D9D&#x0DDF");

            text = text.replace("taa", "&#x0DA7&#x0DCF");
            text = text.replace("tae", "&#x0DA7&#x0DD0");
            text = text.replace("tii", "&#x0DA7&#x0DD3");
            text = text.replace("tee", "&#x0DA7&#x0DD3");
            text = text.replace("tuu", "&#x0DA7&#x0DD6");
            text = text.replace("tru", "&#x0DA7&#x0DD8");
            text = text.replace("tea", "&#x0DA7&#x0DDA");
            text = text.replace("tai", "&#x0DA7&#x0DDB");
            text = text.replace("toa", "&#x0DA7&#x0DDD");
            text = text.replace("tau", "&#x0DA7&#x0DDF");

            text = text.replace("Taa", "&#x0DA8&#x0DCF");
            text = text.replace("Tae", "&#x0DA8&#x0DD0");
            text = text.replace("Tii", "&#x0DA8&#x0DD3");
            text = text.replace("Tee", "&#x0DA8&#x0DD3");
            text = text.replace("Tuu", "&#x0DA8&#x0DD6");
            text = text.replace("Tru", "&#x0DA8&#x0DD8");
            text = text.replace("Tea", "&#x0DA8&#x0DDA");
            text = text.replace("Tai", "&#x0DA8&#x0DDB");
            text = text.replace("Toa", "&#x0DA8&#x0DDD");
            text = text.replace("Tau", "&#x0DA8&#x0DDF");

            text = text.replace("daa", "&#x0DA9&#x0DCF");
            text = text.replace("dae", "&#x0DA9&#x0DD0");
            text = text.replace("dii", "&#x0DA9&#x0DD3");
            text = text.replace("dee", "&#x0DA9&#x0DD3");
            text = text.replace("duu", "&#x0DA9&#x0DD6");
            text = text.replace("dru", "&#x0DA9&#x0DD8");
            text = text.replace("dea", "&#x0DA9&#x0DDA");
            text = text.replace("dai", "&#x0DA9&#x0DDB");
            text = text.replace("doa", "&#x0DA9&#x0DDD");
            text = text.replace("dau", "&#x0DA9&#x0DDF");

            text = text.replace("Daa", "&#x0DAA&#x0DCF");
            text = text.replace("Dae", "&#x0DAA&#x0DD0");
            text = text.replace("Dii", "&#x0DAA&#x0DD3");
            text = text.replace("Dee", "&#x0DAA&#x0DD3");
            text = text.replace("Duu", "&#x0DAA&#x0DD6");
            text = text.replace("Dru", "&#x0DAA&#x0DD8");
            text = text.replace("Dea", "&#x0DAA&#x0DDA");
            text = text.replace("Dai", "&#x0DAA&#x0DDB");
            text = text.replace("Doa", "&#x0DAA&#x0DDD");
            text = text.replace("Dau", "&#x0DAA&#x0DDF");

            text = text.replace("Naa", "&#x0DAB&#x0DCF");
            text = text.replace("Nae", "&#x0DAB&#x0DD0");
            text = text.replace("Nii", "&#x0DAB&#x0DD3");
            text = text.replace("Nee", "&#x0DAB&#x0DD3");
            text = text.replace("Nuu", "&#x0DAB&#x0DD6");
            text = text.replace("Nru", "&#x0DAB&#x0DD8");
            text = text.replace("Nea", "&#x0DAB&#x0DDA");
            text = text.replace("Nai", "&#x0DAB&#x0DDB");
            text = text.replace("Noa", "&#x0DAB&#x0DDD");
            text = text.replace("Nau", "&#x0DAB&#x0DDF");

            text = text.replace("naa", "&#x0DB1&#x0DCF");
            text = text.replace("nae", "&#x0DB1&#x0DD0");
            text = text.replace("nii", "&#x0DB1&#x0DD3");
            text = text.replace("nee", "&#x0DB1&#x0DD3");
            text = text.replace("nuu", "&#x0DB1&#x0DD6");
            text = text.replace("nru", "&#x0DB1&#x0DD8");
            text = text.replace("nea", "&#x0DB1&#x0DDA");
            text = text.replace("nai", "&#x0DB1&#x0DDB");
            text = text.replace("noa", "&#x0DB1&#x0DDD");
            text = text.replace("nau", "&#x0DB1&#x0DDF");

            text = text.replace("paa", "&#x0DB4&#x0DCF");
            text = text.replace("pae", "&#x0DB4&#x0DD0");
            text = text.replace("pii", "&#x0DB4&#x0DD3");
            text = text.replace("pee", "&#x0DB4&#x0DD3");
            text = text.replace("puu", "&#x0DB4&#x0DD6");
            text = text.replace("pru", "&#x0DB4&#x0DD8");
            text = text.replace("pea", "&#x0DB4&#x0DDA");
            text = text.replace("pai", "&#x0DB4&#x0DDB");
            text = text.replace("poa", "&#x0DB4&#x0DDD");
            text = text.replace("pau", "&#x0DB4&#x0DDF");

            text = text.replace("Paa", "&#x0DB5&#x0DCF");
            text = text.replace("Pae", "&#x0DB5&#x0DD0");
            text = text.replace("Pii", "&#x0DB5&#x0DD3");
            text = text.replace("Pee", "&#x0DB5&#x0DD3");
            text = text.replace("Puu", "&#x0DB5&#x0DD6");
            text = text.replace("Pru", "&#x0DB5&#x0DD8");
            text = text.replace("Pea", "&#x0DB5&#x0DDA");
            text = text.replace("Pai", "&#x0DB5&#x0DDB");
            text = text.replace("Poa", "&#x0DB5&#x0DDD");
            text = text.replace("Pau", "&#x0DB5&#x0DDF");

            text = text.replace("baa", "&#x0DB6&#x0DCF");
            text = text.replace("bae", "&#x0DB6&#x0DD0");
            text = text.replace("bii", "&#x0DB6&#x0DD3");
            text = text.replace("bee", "&#x0DB6&#x0DD3");
            text = text.replace("buu", "&#x0DB6&#x0DD6");
            text = text.replace("bru", "&#x0DB6&#x0DD8");
            text = text.replace("bea", "&#x0DB6&#x0DDA");
            text = text.replace("bai", "&#x0DB6&#x0DDB");
            text = text.replace("boa", "&#x0DB6&#x0DDD");
            text = text.replace("bau", "&#x0DB6&#x0DDF");

            text = text.replace("Baa", "&#x0DB7&#x0DCF");
            text = text.replace("Bae", "&#x0DB7&#x0DD0");
            text = text.replace("Bii", "&#x0DB7&#x0DD3");
            text = text.replace("Bee", "&#x0DB7&#x0DD3");
            text = text.replace("Buu", "&#x0DB7&#x0DD6");
            text = text.replace("Bru", "&#x0DB7&#x0DD8");
            text = text.replace("Bea", "&#x0DB7&#x0DDA");
            text = text.replace("Bai", "&#x0DB7&#x0DDB");
            text = text.replace("Boa", "&#x0DB7&#x0DDD");
            text = text.replace("Bau", "&#x0DB7&#x0DDF");

            text = text.replace("maa", "&#x0DB8&#x0DCF");
            text = text.replace("mae", "&#x0DB8&#x0DD0");
            text = text.replace("mii", "&#x0DB8&#x0DD3");
            text = text.replace("mee", "&#x0DB8&#x0DD3");
            text = text.replace("muu", "&#x0DB8&#x0DD6");
            text = text.replace("mru", "&#x0DB8&#x0DD8");
            text = text.replace("mea", "&#x0DB8&#x0DDA");
            text = text.replace("mai", "&#x0DB8&#x0DDB");
            text = text.replace("moa", "&#x0DB8&#x0DDD");
            text = text.replace("mau", "&#x0DB8&#x0DDF");

            text = text.replace("Maa", "&#x0DB9&#x0DCF");
            text = text.replace("Mae", "&#x0DB9&#x0DD0");
            text = text.replace("Mii", "&#x0DB9&#x0DD3");
            text = text.replace("Mee", "&#x0DB9&#x0DD3");
            text = text.replace("Muu", "&#x0DB9&#x0DD6");
            text = text.replace("Mru", "&#x0DB9&#x0DD8");
            text = text.replace("Mea", "&#x0DB9&#x0DDA");
            text = text.replace("Mai", "&#x0DB9&#x0DDB");
            text = text.replace("Moa", "&#x0DB9&#x0DDD");
            text = text.replace("Mau", "&#x0DB9&#x0DDF");

            text = text.replace("yaa", "&#x0DBA&#x0DCF");
            text = text.replace("yae", "&#x0DBA&#x0DD0");
            text = text.replace("yii", "&#x0DBA&#x0DD3");
            text = text.replace("yee", "&#x0DBA&#x0DD3");
            text = text.replace("yuu", "&#x0DBA&#x0DD6");
            text = text.replace("yru", "&#x0DBA&#x0DD8");
            text = text.replace("yea", "&#x0DBA&#x0DDA");
            text = text.replace("yai", "&#x0DBA&#x0DDB");
            text = text.replace("yoa", "&#x0DBA&#x0DDD");
            text = text.replace("yau", "&#x0DBA&#x0DDF");

            text = text.replace("raa", "&#x0DBB&#x0DCF");
            text = text.replace("rae", "&#x0DBB&#x0DD0");
            text = text.replace("rii", "&#x0DBB&#x0DD3");
            text = text.replace("ree", "&#x0DBB&#x0DD3");
            text = text.replace("ruu", "&#x0DBB&#x0DD6");
            text = text.replace("rru", "&#x0DBB&#x0DD8");
            text = text.replace("rea", "&#x0DBB&#x0DDA");
            text = text.replace("rai", "&#x0DBB&#x0DDB");
            text = text.replace("roa", "&#x0DBB&#x0DDD");
            text = text.replace("rau", "&#x0DBB&#x0DDF");

            text = text.replace("laa", "&#x0DBD&#x0DCF");
            text = text.replace("lae", "&#x0DBD&#x0DD0");
            text = text.replace("lii", "&#x0DBD&#x0DD3");
            text = text.replace("lee", "&#x0DBD&#x0DD3");
            text = text.replace("luu", "&#x0DBD&#x0DD6");
            text = text.replace("lru", "&#x0DBD&#x0DD8");
            text = text.replace("lea", "&#x0DBD&#x0DDA");
            text = text.replace("lai", "&#x0DBD&#x0DDB");
            text = text.replace("loa", "&#x0DBD&#x0DDD");
            text = text.replace("lau", "&#x0DBD&#x0DDF");

            text = text.replace("vaa", "&#x0DC0&#x0DCF");
            text = text.replace("vae", "&#x0DC0&#x0DD0");
            text = text.replace("vii", "&#x0DC0&#x0DD3");
            text = text.replace("vee", "&#x0DC0&#x0DD3");
            text = text.replace("vuu", "&#x0DC0&#x0DD6");
            text = text.replace("vru", "&#x0DC0&#x0DD8");
            text = text.replace("vea", "&#x0DC0&#x0DDA");
            text = text.replace("vai", "&#x0DC0&#x0DDB");
            text = text.replace("voa", "&#x0DC0&#x0DDD");
            text = text.replace("vau", "&#x0DC0&#x0DDF");

            text = text.replace("saa", "&#x0DC3&#x0DCF");
            text = text.replace("sae", "&#x0DC3&#x0DD0");
            text = text.replace("sii", "&#x0DC3&#x0DD3");
            text = text.replace("see", "&#x0DC3&#x0DD3");
            text = text.replace("suu", "&#x0DC3&#x0DD6");
            text = text.replace("sru", "&#x0DC3&#x0DD8");
            text = text.replace("sea", "&#x0DC3&#x0DDA");
            text = text.replace("sai", "&#x0DC3&#x0DDB");
            text = text.replace("soa", "&#x0DC3&#x0DDD");
            text = text.replace("sau", "&#x0DC3&#x0DDF");

            text = text.replace("haa", "&#x0DC4&#x0DCF");
            text = text.replace("hae", "&#x0DC4&#x0DD0");
            text = text.replace("hii", "&#x0DC4&#x0DD3");
            text = text.replace("hee", "&#x0DC4&#x0DD3");
            text = text.replace("huu", "&#x0DC4&#x0DD6");
            text = text.replace("hru", "&#x0DC4&#x0DD8");
            text = text.replace("hea", "&#x0DC4&#x0DDA");
            text = text.replace("hai", "&#x0DC4&#x0DDB");
            text = text.replace("hoa", "&#x0DC4&#x0DDD");
            text = text.replace("hau", "&#x0DC4&#x0DDF");

            text = text.replace("Laa", "&#x0DC5&#x0DCF");
            text = text.replace("Lae", "&#x0DC5&#x0DD0");
            text = text.replace("Lii", "&#x0DC5&#x0DD3");
            text = text.replace("Lee", "&#x0DC5&#x0DD3");
            text = text.replace("Luu", "&#x0DC5&#x0DD6");
            text = text.replace("Lru", "&#x0DC5&#x0DD8");
            text = text.replace("Lea", "&#x0DC5&#x0DDA");
            text = text.replace("Lai", "&#x0DC5&#x0DDB");
            text = text.replace("Loa", "&#x0DC5&#x0DDD");
            text = text.replace("Lau", "&#x0DC5&#x0DDF");

            text = text.replace("faa", "&#x0DC6&#x0DCF");
            text = text.replace("fae", "&#x0DC6&#x0DD0");
            text = text.replace("fii", "&#x0DC6&#x0DD3");
            text = text.replace("fee", "&#x0DC6&#x0DD3");
            text = text.replace("fuu", "&#x0DC6&#x0DD6");
            text = text.replace("fru", "&#x0DC6&#x0DD8");
            text = text.replace("fea", "&#x0DC6&#x0DDA");
            text = text.replace("fai", "&#x0DC6&#x0DDB");
            text = text.replace("foa", "&#x0DC6&#x0DDD");
            text = text.replace("fau", "&#x0DC6&#x0DDF");

            //===========================================
            
            text = text.replace("ea", "&#x0D92");
            text = text.replace("aa", "&#x0D86");
            text = text.replace("ae", "&#x0D87");
            text = text.replace("ee", "&#x0D8A");
            text = text.replace("ii", "&#x0D8A");
            text = text.replace("oa", "&#x0D95");
            text = text.replace("ai", "&#x0D93");
            text = text.replace("uu", "&#x0D8C");
            text = text.replace("au", "&#x0D96");
            text = text.replace("ka", "&#x0D9A");
            text = text.replace("Ka", "&#x0D9B");
            text = text.replace("ga", "&#x0D9C");
            text = text.replace("Ga", "&#x0D9D");
            text = text.replace("ja", "&#x0DA2");
            text = text.replace("Ja", "&#x0DA3");
            text = text.replace("ta", "&#x0DA7");
            text = text.replace("Ta", "&#x0DA8");
            text = text.replace("da", "&#x0DA9");
            text = text.replace("Da", "&#x0DAA");
            text = text.replace("na", "&#x0DB1");
            text = text.replace("Na", "&#x0DAB");
            text = text.replace("pa", "&#x0DB4");
            text = text.replace("Pa", "&#x0DB5");
            text = text.replace("ba", "&#x0DB6");
            text = text.replace("Ba", "&#x0DB7");
            text = text.replace("ma", "&#x0DB8");
            text = text.replace("Ma", "&#x0DB9");
            text = text.replace("ya", "&#x0DBA");
            text = text.replace("ra", "&#x0DBB");
            text = text.replace("la", "&#x0DBD");
            text = text.replace("va", "&#x0DC0");
            text = text.replace("sa", "&#x0DC3");
            text = text.replace("ha", "&#x0DC4");
            text = text.replace("La", "&#x0DC5");
            text = text.replace("fa", "&#x0DC6");

            //==========================================

            text = text.replace("ki", "&#x0D9A&#x0DD2");
            text = text.replace("ku", "&#x0D9A&#x0DD4");
            text = text.replace("ke", "&#x0D9A&#x0DD9");
            text = text.replace("ko", "&#x0D9A&#x0DDC");

            text = text.replace("Ki", "&#x0D9B&#x0DD2");
            text = text.replace("Ku", "&#x0D9B&#x0DD4");
            text = text.replace("Ke", "&#x0D9B&#x0DD9");
            text = text.replace("Ko", "&#x0D9B&#x0DDC");

            text = text.replace("gi", "&#x0D9C&#x0DD2");
            text = text.replace("gu", "&#x0D9C&#x0DD4");
            text = text.replace("ge", "&#x0D9C&#x0DD9");
            text = text.replace("go", "&#x0D9C&#x0DDC");

            text = text.replace("ji", "&#x0DA2&#x0DD2");
            text = text.replace("ju", "&#x0DA2&#x0DD4");
            text = text.replace("je", "&#x0DA2&#x0DD9");
            text = text.replace("jo", "&#x0DA2&#x0DDC");

            text = text.replace("Gi", "&#x0D9D&#x0DD2");
            text = text.replace("Gu", "&#x0D9D&#x0DD4");
            text = text.replace("Ge", "&#x0D9D&#x0DD9");
            text = text.replace("Go", "&#x0D9D&#x0DDC");

            text = text.replace("ti", "&#x0DA7&#x0DD2");
            text = text.replace("tu", "&#x0DA7&#x0DD4");
            text = text.replace("te", "&#x0DA7&#x0DD9");
            text = text.replace("to", "&#x0DA7&#x0DDC");

            text = text.replace("th", "&#x0DAD&#x0DCA");

            text = text.replace("Ti", "&#x0DA8&#x0DD2");
            text = text.replace("Tu", "&#x0DA8&#x0DD4");
            text = text.replace("Te", "&#x0DA8&#x0DD9");
            text = text.replace("To", "&#x0DA8&#x0DDC");

            text = text.replace("di", "&#x0DA9&#x0DD2");
            text = text.replace("du", "&#x0DA9&#x0DD4");
            text = text.replace("de", "&#x0DA9&#x0DD9");
            text = text.replace("do", "&#x0DA9&#x0DDC");

            text = text.replace("Di", "&#x0DAA&#x0DD2");
            text = text.replace("Du", "&#x0DAA&#x0DD4");
            text = text.replace("De", "&#x0DAA&#x0DD9");
            text = text.replace("Do", "&#x0DAA&#x0DDC");

            text = text.replace("Ni", "&#x0DAB&#x0DD2");
            text = text.replace("Nu", "&#x0DAB&#x0DD4");
            text = text.replace("Ne", "&#x0DAB&#x0DD9");
            text = text.replace("No", "&#x0DAB&#x0DDC");

            text = text.replace("ni", "&#x0DB1&#x0DD2");
            text = text.replace("nu", "&#x0DB1&#x0DD4");
            text = text.replace("ne", "&#x0DB1&#x0DD9");
            text = text.replace("no", "&#x0DB1&#x0DDC");

            text = text.replace("pi", "&#x0DB4&#x0DD2");
            text = text.replace("pu", "&#x0DB4&#x0DD4");
            text = text.replace("pe", "&#x0DB4&#x0DD9");
            text = text.replace("po", "&#x0DB4&#x0DDC");

            text = text.replace("Pi", "&#x0DB5&#x0DD2");
            text = text.replace("Pu", "&#x0DB5&#x0DD4");
            text = text.replace("Pe", "&#x0DB5&#x0DD9");
            text = text.replace("Po", "&#x0DB5&#x0DDC");

            text = text.replace("bi", "&#x0DB6&#x0DD2");
            text = text.replace("bu", "&#x0DB6&#x0DD4");
            text = text.replace("be", "&#x0DB6&#x0DD9");
            text = text.replace("bo", "&#x0DB6&#x0DDC");

            text = text.replace("Bi", "&#x0DB7&#x0DD2");
            text = text.replace("Bu", "&#x0DB7&#x0DD4");
            text = text.replace("Be", "&#x0DB7&#x0DD9");
            text = text.replace("Bo", "&#x0DB7&#x0DDC");

            text = text.replace("mi", "&#x0DB8&#x0DD2");
            text = text.replace("mu", "&#x0DB8&#x0DD4");
            text = text.replace("me", "&#x0DB8&#x0DD9");
            text = text.replace("mo", "&#x0DB8&#x0DDC");

            text = text.replace("Mi", "&#x0DB9&#x0DD2");
            text = text.replace("Mu", "&#x0DB9&#x0DD4");
            text = text.replace("Me", "&#x0DB9&#x0DD9");
            text = text.replace("Mo", "&#x0DB9&#x0DDC");

            text = text.replace("yi", "&#x0DBA&#x0DD2");
            text = text.replace("yu", "&#x0DBA&#x0DD4");
            text = text.replace("ye", "&#x0DBA&#x0DD9");
            text = text.replace("yo", "&#x0DBA&#x0DDC");

            text = text.replace("ri", "&#x0DBB&#x0DD2");
            text = text.replace("ru", "&#x0DBB&#x0DD4");
            text = text.replace("re", "&#x0DBB&#x0DD9");
            text = text.replace("ro", "&#x0DBB&#x0DDC");

            text = text.replace("li", "&#x0DBD&#x0DD2");
            text = text.replace("lu", "&#x0DBD&#x0DD4");
            text = text.replace("le", "&#x0DBD&#x0DD9");
            text = text.replace("lo", "&#x0DBD&#x0DDC");

            text = text.replace("vi", "&#x0DC0&#x0DD2");
            text = text.replace("vu", "&#x0DC0&#x0DD4");
            text = text.replace("ve", "&#x0DC0&#x0DD9");
            text = text.replace("vo", "&#x0DC0&#x0DDC");

            text = text.replace("si", "&#x0DC3&#x0DD2");
            text = text.replace("su", "&#x0DC3&#x0DD4");
            text = text.replace("se", "&#x0DC3&#x0DD9");
            text = text.replace("so", "&#x0DC3&#x0DDC");

            text = text.replace("hi", "&#x0DC4&#x0DD2");
            text = text.replace("hu", "&#x0DC4&#x0DD4");
            text = text.replace("he", "&#x0DC4&#x0DD9");
            text = text.replace("ho", "&#x0DC4&#x0DDC");

            text = text.replace("Li", "&#x0DC5&#x0DD2");
            text = text.replace("Lu", "&#x0DC5&#x0DD4");
            text = text.replace("Le", "&#x0DC5&#x0DD9");
            text = text.replace("Lo", "&#x0DC5&#x0DDC");

            text = text.replace("fi", "&#x0DC6&#x0DD2");
            text = text.replace("fu", "&#x0DC6&#x0DD4");
            text = text.replace("fe", "&#x0DC6&#x0DD9");
            text = text.replace("fo", "&#x0DC6&#x0DDC");

            //==========================================
            
            text = text.replace("a", "&#x0D85");
            text = text.replace("b", "&#x0DB6&#x0DCA");
            text = text.replace("c", "&#x0DA0&#x0DCA");
            text = text.replace("d", "&#x0DA9&#x0DCA");
            text = text.replace("e", "&#x0D91");
            text = text.replace("f", "&#x0DC6&#x0DCA");
            text = text.replace("g", "&#x0D9C&#x0DCA");
            text = text.replace("h", "&#x0DC4&#x0DCA");
            text = text.replace("i", "&#x0D89");
            text = text.replace("j", "&#x0DA2&#x0DCA");
            text = text.replace("k", "&#x0D9A&#x0DCA");
            text = text.replace("l", "&#x0DBD&#x0DCA");
            text = text.replace("m", "&#x0DB8&#x0DCA");
            text = text.replace("n", "&#x0DB1&#x0DCA");
            text = text.replace("o", "&#x0D94");
            text = text.replace("p", "&#x0DB4&#x0DCA");
            text = text.replace("r", "&#x0DBB&#x0DCA");
            text = text.replace("s", "&#x0DC3&#x0DCA");
            text = text.replace("t", "&#x0DA7&#x0DCA");
            text = text.replace("u", "&#x0D8B");
            text = text.replace("v", "&#x0DC0&#x0DCA");
            text = text.replace("w", "&#x0DC0&#x0DCA");
            text = text.replace("y", "&#x0DBA&#x0DCA");
            text = text.replace("z", "&#x0DC2&#x0DCA");

            text = text.replace("B", "&#x0DB7&#x0DCA");
            text = text.replace("C", "&#x0DA1&#x0DCA");
            text = text.replace("D", "&#x0DAA&#x0DCA");
            text = text.replace("G", "&#x0D9D&#x0DCA");
            text = text.replace("X", "&#x0D9E");
            text = text.replace("J", "&#x0DA3&#x0DCA");
            text = text.replace("K", "&#x0D9A&#x0DCA");
            text = text.replace("L", "&#x0DC5&#x0DCA");
            text = text.replace("M", "&#x0DB9&#x0DCA");
            text = text.replace("N", "&#x0DAB&#x0DCA");
            text = text.replace("P", "&#x0DB5&#x0DCA");
            text = text.replace("T", "&#x0DB0&#x0DCA");
            text = text.replace("X", "&#x0D9E&#x0DCA");
            
            byte[] bytes = text.getBytes("UTF8");
            text = new String(bytes, Charset.forName("UTF-8"));
            
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(ConvertToSinhala.class.getName()).log(Level.SEVERE, null, ex);
        }
        return text;
    }
    
}
