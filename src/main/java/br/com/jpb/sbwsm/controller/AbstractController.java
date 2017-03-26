package br.com.jpb.sbwsm.controller;

import com.google.common.base.Joiner;
import org.springframework.ui.ModelMap;
import org.springframework.validation.ObjectError;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author "<a href='jpbassinello@gmail.com'>João Paulo Bassinello</a>"
 */
public abstract class AbstractController {

	private static final Joiner BR_JOINER = Joiner.on("<br />");

	private static final String ERROR_MESSAGE_ATTRIBUTE_NAME = "errorMessage";
	private static final String SUCCESS_MESSAGE_ATTRIBUTE_NAME = "successMessage";
	private static final String WARNING_MESSAGE_ATTRIBUTE_NAME = "warningMessage";
	private static final String HAS_MESSAGE_ATTRIBUTE_NAME = "hasMessage";

	protected void addErrorMessage(ModelMap model, String message) {
		addModelMapMessage(model, message, ERROR_MESSAGE_ATTRIBUTE_NAME);
	}

	protected void addErrorMessage(ModelMap model, List<ObjectError> errors) {
		String errorMesssage = BR_JOINER.join(errors
				.stream()
				.map(e -> e.getDefaultMessage())
				.collect(Collectors.toList()));
		addModelMapMessage(model, errorMesssage, ERROR_MESSAGE_ATTRIBUTE_NAME);
	}

	protected void addSuccessMessage(ModelMap model, String message) {
		addModelMapMessage(model, message, SUCCESS_MESSAGE_ATTRIBUTE_NAME);
	}

	protected void addWarningMessage(ModelMap model, String message) {
		addModelMapMessage(model, message, WARNING_MESSAGE_ATTRIBUTE_NAME);
	}

	protected void addErrorMessage(HttpServletRequest request, String message) {
		addRequestMessage(request, message, ERROR_MESSAGE_ATTRIBUTE_NAME);
	}

	protected void addErrorMessage(HttpServletRequest request, List<ObjectError> errors) {
		String errorMesssage = BR_JOINER.join(errors
				.stream()
				.map(e -> e.getDefaultMessage())
				.collect(Collectors.toList()));
		addRequestMessage(request, errorMesssage, ERROR_MESSAGE_ATTRIBUTE_NAME);
	}

	protected void addSuccessMessage(HttpServletRequest request, String message) {
		addRequestMessage(request, message, SUCCESS_MESSAGE_ATTRIBUTE_NAME);
	}

	protected void addWarningMessage(HttpServletRequest request, String message) {
		addRequestMessage(request, message, WARNING_MESSAGE_ATTRIBUTE_NAME);
	}

	private void addRequestMessage(HttpServletRequest request, String message, String attrName) {
		request.setAttribute(attrName, message);
		request.setAttribute(HAS_MESSAGE_ATTRIBUTE_NAME, true);
	}

	private void addModelMapMessage(ModelMap model, String message, String attrName) {
		model.addAttribute(attrName, message);
		model.addAttribute(HAS_MESSAGE_ATTRIBUTE_NAME, true);
	}

}