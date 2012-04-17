#puts File.dirname(__FILE__)
require 'fileutils'
if ARGV[0]== "--help" || ARGV[0] == "-h"

elsif ARGV.length == 2
  package_name     = ARGV[0]
  project_location = ARGV[1]

  r_required_files = %w[DateSlider.java DefaultDateSlider.java ScrollLayout.java]

  #copy files src to target's src folder
  FileUtils.cp_r "src", "#{project_location}"
  date_slider_dir        = Dir.open("src/th/in/fingertip/dateslider")
  target_date_slider_dir = Dir.open("#{project_location}/#{date_slider_dir.path}")

  r_required_files.each do |file_name|
    file = File.open("#{target_date_slider_dir.path}/#{file_name}", "r+")

    #modify code
    codes = file.readlines
    codes.insert(1, "import #{package_name}.R;\n");

    #write back
    file.rewind
    file.write(codes.join)
    file.close
  end

  #copy res/drawable
  FileUtils.cp_r "res/drawable", "#{project_location}/res/"

  #copy layout
  FileUtils.cp_r "res/layout", "#{project_location}/res/"

  #copy attrs/styles values
  %w[attrs.xml styles.xml].each do |file_name|
    if(File.exists? "#{project_location}/res/values/#{file_name}")
      original_file = File.open("res/values/#{file_name}", "r")
      chunks        = original_file.readlines[2..7]
      target_file   = File.open("#{project_location}/res/values/#{file_name}", "r+")
      codes         = target_file.readlines
      codes.insert(-2, chunks.join)
      target_file.rewind
      target_file.write(codes.join)
      original_file.close
      target_file.close
    else
      FileUtils.cp_r "res/values/#{file_name}", "#{project_location}/res/values"
    end
  end

  puts "Completed."

else
  puts <<-END
    usage:    ruby install.rb [package_name] [project_location]
              [package_name] a name of your default package in your project
              [project_location] a path to your project

    example:  ruby install.rb com.example ~/Projects/eclipse/workspace/myproject
  END
end