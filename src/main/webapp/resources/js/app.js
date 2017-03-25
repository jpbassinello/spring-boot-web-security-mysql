function ajax(url, getOrPost, data, beforeSend, successCallBack) {
	if (!data) {
		data = {};
	}
	data.noCacheControl = new Date().getTime();
	$.ajax({
		url: url,
		type: getOrPost,
		data: data,
		beforeSend: function () {
			if (beforeSend) {
				beforeSend();
			}
		},
		success: function (data) {
			if (successCallBack) {
				successCallBack(data);
			}
		},
		statusCode: {
			500: function () {
				document.location.href = '/500';
				return false;
			}
		}
	});
}