<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

  <input type="hidden" id="widget" value="DATEBOX" />
  <input type="hidden" id="name" value="${scalarParameter.name}" />
  <c:choose>
    <c:when test="${empty scalarParameter.defaultValue}">
      <input type="hidden" id="defaultvalue" value="" />
    </c:when>
    <c:otherwise>
      <input type="hidden" id="defaultvalue" value="${scalarParameter.defaultValue[0]}" />
    </c:otherwise>
  </c:choose>
  <input type="hidden" id="datatype" value="${scalarParameter.dataType}" />
  <input type="hidden" id="parametertype" value="${scalarParameter.parameterType}" />
  <input type="hidden" id="required" value="${scalarParameter.required}" />
  <input type="hidden" id="helptext" value="${scalarParameter.helpText}" />
  <input type="hidden" id="hidden" value="${scalarParameter.hidden}" />
  <c:choose>
    <c:when test="${empty scalarParameter.value}">
      <input type="hidden" id="${scalarParameter.name}_currentvalue" value="" />
    </c:when>
    <c:otherwise>
      <input type="hidden" id="${scalarParameter.name}_currentvalue" value="${scalarParameter.value[0]}" />
    </c:otherwise>
  </c:choose>
  <x-datepicker id='${scalarParameter.name}_value'></x-datepicker>

  <script type="text/javascript">
    $(function () {
      var dateMoment = moment($('#${scalarParameter.name}_currentvalue').val(),
        'YYYY-MM-DD');
      $('#${scalarParameter.name}_value').attr('defaultdate',
        (dateMoment == null || !dateMoment.isValid() ? moment() : dateMoment)
          .format('YYYY-MM-DD')); // iso
    });
  </script>