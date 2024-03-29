var SlackClientExample = SlackClientExample || (function() {
	var url, $msg;
	
	function render(params) {
		url = params.baselocation;
		$("#slack-post").click(send);
		$msg = $("#slack-message").focus();
	}

	function send() {
		$.ajax({ url: url, method: "post", data: { message: $msg.val() }}).done(function(res) {
			if (res.status === 200) {
				$msg.val("");
				$ui.toast({ type: "info", content: "Message posted !" });
			} else {
				$ui.toast({ type: "error", content: res.error });
			}
			console.log(res);
		});
	}

	return { render: render };
})();