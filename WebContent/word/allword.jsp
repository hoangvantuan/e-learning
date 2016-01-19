<%@ taglib prefix="s" uri="/struts-tags"%>

<div class="container">
    <!-- Form -->
    <form action="word/filterWord" method="GET">
        <!-- Option -->
        <div class="row">
            <div class="col-md-8 col-md-offset-2">
                <div class="col-md-6">
                    <label for="category">Category</label> <select class="form-control"
                        name="categoryIdFilter">
                        <s:iterator value="listCategory">
                            <option value=${category_id }>${name }</option>
                        </s:iterator>
                    </select>
                </div>
                <div class="col-md-6">
                    <label for="options">Options</label><br> <label class="radio-inline">
                        <input type="radio" id="inlineRadio1" name="optionFilter"
                        value="learned" checked> Learned
                    </label> <label class="radio-inline"> <input type="radio" name="optionFilter"
                        id="inlineRadio2" value="unlearn"> Unlearned
                    </label> <label class="radio-inline"> <input type="radio" name="optionFilter"
                        id="inlineRadio3" value="all"> All
                    </label>
                </div>
            </div>
        </div>
        <div class="row">
            <input class="btn btn-default col-md-offset-8" type="submit" value="Filter">
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