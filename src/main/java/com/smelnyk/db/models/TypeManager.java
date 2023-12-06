package com.smelnyk.db.models;


import java.util.regex.Pattern;

public class TypeManager {
    public static Object parseObjectByType(String object, Type dataType) throws NumberFormatException {
        String rgbRegex = "^rgb\\((0|255|25[0-4]|2[0-4]\\d|1\\d\\d|0?\\d?\\d),(0|255|25[0-4]|2[0-4]\\d|1\\d\\d|0?\\d?\\d),(0|255|25[0-4]|2[0-4]\\d|1\\d\\d|0?\\d?\\d)\\)$";
        switch (dataType) {
            case INTEGER:
                return Integer.valueOf(object);
            case CHAR:
                if(Pattern.matches(".?", object))
                    return object.charAt(0);
                else
                    throw new NumberFormatException("error");
            case REAL:
                return Double.valueOf(object);
            case STRING:
                return object;
            case COMPLEXINTEGER: {
                if (object == null || object == "") return object;
                char[] s = object.toCharArray();
                int pos = -1;
                for (int j=0; j<s.length; j += 1)
                {
                    if (s[j] == '+' || s[j] == '-')
                    {
                        pos = j;
                        break;
                    }
                }
                if (pos == -1)
                {
                    if (s[s.length - 1] == 'i')
                    {
                        String b_s = object.substring(0, object.length() - 1);
                        try {
                            int b = Integer.parseInt(b_s);
                        } catch(Exception e)
                        {
                            throw new NumberFormatException("error");
                        }
                    } else
                    {
                        try {
                            int a = Integer.parseInt(object);
                        } catch(Exception e)
                        {
                            throw new NumberFormatException("error");
                        }
                    }
                } else {
                    if (s[s.length - 1] != 'i') throw new NumberFormatException("error");
                    String a_s = object.substring(0, pos);
                    String b_s = object.substring(pos, object.length() - 1);
                    try {
                        int a = Integer.parseInt(a_s);
                        if (b_s.length() != 1) {
                            int b = Integer.parseInt(b_s);
                        }
                    } catch (Exception e)
                    {
                        throw new NumberFormatException("error");
                    }
                }
                return object;
            }
            case COMPLEXREAL:
                if (object == null || object == "") return object;
                char[] s = object.toCharArray();
                int pos = -1;
                for (int j=0; j<s.length; j += 1)
                {
                    if (s[j] == '+' || s[j] == '-')
                    {
                        pos = j;
                        break;
                    }
                }
                if (pos == -1)
                {
                    if (s[s.length - 1] == 'i')
                    {
                        String b_s = object.substring(0, object.length() - 1);
                        try {
                            double b = Double.parseDouble(b_s);
                        } catch (Exception e)
                        {
                            throw new NumberFormatException("error");
                        }
                    } else
                    {
                        try {
                            double a = Double.parseDouble(object);
                        } catch (Exception e)
                        {
                            throw new NumberFormatException("error");
                        }
                    }
                } else {
                    if (s[s.length - 1] != 'i') throw new NumberFormatException("error");
                    String a_s = object.substring(0, pos);
                    String b_s = object.substring(pos, object.length() - 1);
                    try {
                        double a = Double.parseDouble(a_s);
                        if (b_s.length() != 1) {
                            double b = Double.parseDouble(b_s);
                        }
                    } catch (Exception e)
                    {
                        throw new NumberFormatException("error");
                    }
                }
                return object;
            default:
                throw new NumberFormatException("Unknown data format");
        }
    }
}
