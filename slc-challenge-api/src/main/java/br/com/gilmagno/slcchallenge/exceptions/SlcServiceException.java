package br.com.gilmagno.slcchallenge.exceptions;

public class SlcServiceException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public SlcServiceException(String msg) {
		super(msg);
	}
	
	public SlcServiceException(String msg, Throwable ex) {
		super(msg, ex);
	}

}
