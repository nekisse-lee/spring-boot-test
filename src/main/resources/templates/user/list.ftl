<!DOCTYPE html>
<html lang="kr">
<head>
</head>
<body>


<div class="container" id="main">
   <div class="col-md-10 col-md-offset-1">
      <div class="panel panel-default">
          <table class="table table-hover">
              <h1>회원 리스트!!!!!!!!!!!!!!!!!ㄴㅇㄹㄴㅇㄹ!!!!!!!!</h1>
              <thead>
                <tr>
                    <th>#</th> <th>사용자 아이디</th> <th>이름</th> <th>내용</th><th></th>
                </tr>

              </thead>
          <#list users as item>
              <tbody>
                <tr>
                    <th scope="row">${item.id}</th>
                    <td>${item.userId}</td>
                    <td>${item.title}</td>
                    <td>${item.description}</td>
                    <td><a href="/users/${item.id}/form" class="btn btn-success" role="button">수정</a></td>
                </tr>
                <!--<tr>-->
                    <!--<th scope="row">2</th> <td>slipp</td> <td>슬립</td> <td>slipp@sample.net</td><td><a href="#" class="btn btn-success" role="button">수정</a></td>-->
                <!--</tr>-->

              </tbody>
          </#list>
          </table>
        </div>
    </div>
</div>

<!-- script references -->
<script src="../js/jquery-2.2.0.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/scripts.js"></script>
	</body>
</html>