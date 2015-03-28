package com.ventura.libros.web.libros;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.junit.runner.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.ventura.libros.domain.login.User;
import com.ventura.libros.domain.session.session;
import com.ventura.libros.service.conpyg.conpygService;
import com.ventura.libros.domain.conpyg.conpyg;

@Controller
@RequestMapping(value = "/conpyg")
@SessionAttributes({ "user_inicio" })
public class LibrosController {

	/** Logger for this class and subclasses */
	protected final Log logger = LogFactory.getLog(getClass());

	@Autowired
	private conpygService conpygService;

	@RequestMapping(value = "/mostrar")
	public String inicio(Model model) {
		if (model.containsAttribute("user_inicio") == true) {
			session ses = (session) model.asMap().get("user_inicio");
			model.addAttribute("usuarioactuall", ses.getUsuario());
			/* ses.setCondicionActual("");
			ses.setHistorial("");
			ses.setCondicionActual(ses.getCondicionUsuario());
			String[] cond = ses.getCondicionActual().split(",");
			String mens = "";
			for (String cc : cond) {
				if (mens.isEmpty()) {
					mens = ses.getValores().get(cc);
				} else {
					mens = mens + " " + ses.getValores().get(cc);
				}
			} */
			String mens = "";
			model.addAttribute("mensaje", mens.toUpperCase());
			model.addAttribute("user_inicio", ses);
			model.addAttribute(
					"listcomp",
					conpygService.getLibros(ses.getCondiciones(),
							ses.getCondicionActual()));
			model.addAttribute("compra", new conpyg());
			return "dashboard";
		} else {
			return "redirect:/index/ingreso";
		}
	}

	@RequestMapping(value = "/retornar", method = RequestMethod.GET)
	public String retornar(Model model) {
		if (model.containsAttribute("user_inicio") == true) {
			String ret = "redirect:mostrar";
			session ses = (session) model.asMap().get("user_inicio");
			String[] cond = ses.getCondicionActual().split(",");
			if (ses.getHistorial().length() > 1) {
				String ncond = "";
				String hist = "";
				for (int i = 4; i < cond.length - 1; i++) {
					if (ncond.isEmpty()) {
						ncond = cond[i];
					} else {
						ncond = ncond + "," + cond[i];
					}
					hist = hist + ses.getHistorial().charAt(i - 4);
				}
				if (hist.charAt(hist.length() - 1) == 'p') {
					ret = "redirect:proveedor";
				} else if (hist.charAt(hist.length() - 1) == 'i') {
					ret = "redirect:item";
				} else if (hist.charAt(hist.length() - 1) == 'c') {
					ret = "redirect:comprador";
				} else if (hist.charAt(hist.length() - 1) == 'q') {
					ret = "redirect:clase";
				} else if (hist.charAt(hist.length() - 1) == 'k') {
					ret = "redirect:centro";
				} else if (hist.charAt(hist.length() - 1) == 'r') {
					ret = "redirect:requisicion";
				} else if (hist.charAt(hist.length() - 1) == 'o') {
					ret = "redirect:orden";
				}
				ses.setCondicionActual(ses.getCondicionUsuario() + "," + ncond);
				ses.setHistorial(hist);
			} else {
				ses.setHistorial("");
				ses.setCondicionActual("");
			}
			model.addAttribute("user_inicio", ses);
			return ret;
		} else {
			return "redirect:/index/ingreso";
		}
	}

	@RequestMapping(value = "/salir", method = RequestMethod.GET)
	public String salir(Model model, SessionStatus status) {
		status.setComplete();
		return "redirect:/index/ingreso";
	}

	@RequestMapping(value = "/actualizar", method = RequestMethod.GET)
	public String actualizar(Model model) {
		if (model.containsAttribute("user_inicio") == true) {
			model.addAttribute("redireccion", "mostrar");
			model.addAttribute("accion", "generar");
			model.addAttribute("compra", new conpyg());
			session ses = (session) (model.asMap().get("user_inicio"));
			if (ses.getCenters().isEmpty()) {
				model.addAttribute("cennnn", 0);
			} else {
				model.addAttribute("cennnn", 1);
			}
			return "actualizar";
		} else {
			return "redirect:/index/ingreso";
		}
	}

	@RequestMapping(value = "/generar", method = RequestMethod.POST)
	public String generaar(@ModelAttribute("compra") conpyg conpyg, Model model) {
		if (model.containsAttribute("user_inicio") == true) {
			session ses = (session) (model.asMap().get("user_inicio"));
			/*if (ses.getCenters().isEmpty()) {
				ses.setCondicionUsuario("a" + conpyg.getPano() + ",m"
						+ conpyg.getPmes() + ",c" + conpyg.getPcia() + ",l"
						+ conpyg.getPpais() + ",m" + conpyg.getPmond());
			} else {
				ses.setCondicionUsuario("a" + conpyg.getPano() + ",m"
						+ conpyg.getPmes() + ",c" + conpyg.getPcia() + ",l"
						+ conpyg.getPpais() + ",m" + conpyg.getPmond() + ",k"
						+ conpyg.getPcent());
			}*/
			model.addAttribute("user_inicio", ses);
			return "redirect:mostrar";
		} else {
			return "redirect:/index/ingreso";
		}
	}

}
