package com.rcs.newsletter.portlets.newsletteradmin;

import java.util.HashMap;
import java.util.Map;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.bind.annotation.RenderMapping;

/**
 *
 * @author ggenovese <gustavo.genovese@rotterdam-cs.com>
 */
@Controller
@RequestMapping("VIEW")
public class NewsletterAdminController {

    @RenderMapping
    public ModelAndView initialView(RenderRequest request, RenderResponse response){
        Map<String,Object> model = new HashMap<String,Object>();
        return new ModelAndView("admin/admin", model);
    }
}