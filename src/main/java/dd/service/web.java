package dd.service;

import dd.dao.SkuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;

/**
 * @program: test
 * @description:
 * @author: 胡凯铭
 * @create: 2020-01-31 12:40
 **/
@Controller
public class web {
@Autowired
    SkuDao skuDao;
    @GetMapping("/hkm")
    public String hkm(Model model){

        model.addAttribute("hkm",skuDao.findHkmk());
        return "hkm.jsp";
    }
    @Transactional
    @GetMapping("/hkmh")
    public String hkm(Model model,Integer id){

        skuDao.deleteId(id);
        Arrays.asList(1,5,3).get(5);
        model.addAttribute("hkm",skuDao.findHkmk());
        return "hkm.jsp";
    }


}

