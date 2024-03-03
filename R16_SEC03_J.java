/* Rule 16. Platform Security (SEC)
SEC03-J. Do not encode sensitive information using encodings that are not specified
  
Non-compliant code: */

String encodedPassword = Base64.encodeBase64String(password.getBytes());

/* Corrected Code */

char[] encodedPassword = password.toCharArray();
