<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container">
	<!-- Form -->
	<form action="word/filterWord" method="POST">
		<!-- Option -->
		<div class="row">
			<div class="col-md-8 col-md-offset-2">
				<div class="col-md-6">
					<label for="category">Category</label> <select class="form-control"
						name="category">
						<option>Category 1</option>
						<option>Category 2</option>
						<option>Category 3</option>
						<option>Category 4</option>
					</select>
				</div>
				<div class="col-md-6">
					<label for="options">Options</label><br> <label
						class="radio-inline"> <input type="radio" name="options"
						id="inlineRadio1" value="learned"> Learned
					</label> <label class="radio-inline"> <input type="radio"
						name="options" id="inlineRadio2" value="unlearned">
						Unlearned
					</label> <label class="radio-inline"> <input type="radio"
						name="options" id="inlineRadio3" value="all"> All
					</label>
				</div>
			</div>
		</div>
		<div class="row">
			<input class="btn btn-default col-md-offset-8" type="submit"
				value="Filter">
		</div>
	</form>
	<hr>
	<!-- List Wprd -->
	<div class="row">
		<div class="col-md-12">
			<s:iterator value="listWord">
				<div class="col-md-3">
					<s:property value="content" />
				</div>
			</s:iterator>
		</div>
	</div>
</div>