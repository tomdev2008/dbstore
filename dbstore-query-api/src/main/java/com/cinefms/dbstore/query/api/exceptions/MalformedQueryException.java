package com.cinefms.dbstore.query.api.exceptions;


public class MalformedQueryException extends RuntimeException {

	private static final long serialVersionUID = 162642578926546833L;
	
	public static enum ERROR_CODE{
		FIELD_MISSING,
		OPERATOR_MISSING,
		COMPARATOR_MISSING,
		BETWEEN_VALUE_MISSING,
		QUERY_CAN_NOT_BE_NULL,
		WRONG_REGEX_TERM, 
		KEY_MUST_NOT_BE_NULL, 
		SUB_QUERIES_CANNOT_USE_OTHER_DB
	}
	
	public MalformedQueryException() {
		super(ERROR_CODE.FIELD_MISSING.toString(),null);
	}
	
	public MalformedQueryException(ERROR_CODE code) {
		super(code.toString(),null);
	}
}
