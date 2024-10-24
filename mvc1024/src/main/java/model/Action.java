package model;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controler.ActionFoward;

public interface Action {
	ActionFoward execute(HttpServletRequest request, 
			HttpServletResponse response) throws IOException;
}
