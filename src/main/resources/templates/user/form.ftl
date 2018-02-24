<!DOCTYPE html>
<html lang="kr">
<head>
</head>
<body>

<div class="container" id="main">
   <div class="col-md-6 col-md-offset-3">
      <div class="panel panel-default content-main">
          <form name="question" method="post" action="/users">
              <div class="form-group">
                  <label for="userId">사용자 아이디 숫자</label>
                  <input class="form-control" id="userId" name="userId" placeholder="User ID">
              </div>
              <div class="form-group">
                  <label for="title">제목</label>
                  <input type="title" class="form-control" id="title" name="title" placeholder="제목">
              </div>
              <div class="form-group">
                  <label for="description">내용</label>
                  <input class="form-control" id="description" name="description" placeholder="내용">
              </div>

              <button type="submit" class="btn btn-success clearfix pull-right">회원가입</button>
              <div class="clearfix" />
          </form>
        </div>
    </div>
</div>

<!-- script references -->
<script src="../js/jquery-2.2.0.min.js"></script>
<script src="../js/bootstrap.min.js"></script>
<script src="../js/scripts.js"></script>
	</body>
</html>