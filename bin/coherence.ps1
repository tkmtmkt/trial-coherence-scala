<#
.SYNOPSIS
This will start a console application
demonstrating the functionality of the Coherence(tm) API
This will start a cache server
#>
$ps1_file = $MyInvocation.MyCommand.Path
$base_dir = split-path $ps1_file

$main_jar = Get-LatestPath "$base_dir\..\main\target\scala-*\main*.jar"
$coherence_jar = "$APPSDIR\coherence\lib\coherence.jar"

$class_path = "$main_jar;$coherence_jar"

$argList = @" 
-server -showversion
-Djava.net.preferIPv4Stack=true
-Dtangosol.coherence.distributed.localstorage=true
-Dtangosol.coherence.cluster=$($Env:COMPUTERNAME)
-cp $class_path
com.tangosol.net.CacheFactory
"@ -replace "`r*`n"," "

start java $argList -NoNewWindow

# vim: set ts=4 sw=4 et:
