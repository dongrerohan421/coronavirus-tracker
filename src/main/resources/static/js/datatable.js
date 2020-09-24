$(document).ready( function () {
	 var table = $('#locationStatsTable').DataTable({
			"sAjaxSource": "/locationStats",
			"sAjaxDataProp": "",
			"order": [[ 1, "asc" ]],
			"aoColumns": [
			      { "mData": "state"},
		          { "mData": "country" },
				  { "mData": "latestTotalCases" },
				  { "mData": "diffFromPrevDay" }
			]
	 })
});