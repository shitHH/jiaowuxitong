<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%
    String bp = "http://" + request.getServerName() + ":" + request.getLocalPort() + request.getContextPath();

    request.setAttribute("bp", bp);
%>